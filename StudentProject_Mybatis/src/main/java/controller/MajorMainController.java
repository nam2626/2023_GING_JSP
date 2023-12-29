package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.MajorDTO;
import service.StudentService;
import view.ModelAndView;

public class MajorMainController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//전체 학과정보 받아옴
		List<MajorDTO> majorList = StudentService.getInstance().selectAllMajor();
		HttpSession session = request.getSession();
		session.setAttribute("majorList", majorList);
		
		//페이지 이동 - major_main.jsp
		return new ModelAndView("major_main.jsp", false);
	}

}









