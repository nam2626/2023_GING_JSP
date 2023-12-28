package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;

import dto.MajorDTO;
import service.StudentService;
import view.ModelAndView;

public class MajorInsertController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//전체 학과정보 받아옴
		ArrayList<MajorDTO> majorList = StudentService.getInstance().selectAllMajor();
		HttpSession session = request.getSession();
		session.setAttribute("majorList", majorList);
		JSONArray arr = new JSONArray(majorList);
		
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(arr.toString());
		
		return null;
	}

}








