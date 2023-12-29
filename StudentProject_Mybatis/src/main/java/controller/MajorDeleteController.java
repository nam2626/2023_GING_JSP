package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import dto.MajorDTO;
import service.StudentService;
import view.ModelAndView;

public class MajorDeleteController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int majorNo = Integer.parseInt(request.getParameter("majorNo"));

		int result = StudentService.getInstance().deleteMajor(majorNo);

		JSONObject obj = new JSONObject();
		if (result == 0)
			obj.put("msg", "학과정보 삭제에 실패하였습니다. 데이터를 확인해 보세요.");
		else
			obj.put("msg", "학과정보 삭제에 성공하였습니다.");

		// 전체 학과정보 받아옴
		List<MajorDTO> majorList = StudentService.getInstance().selectAllMajor();
		HttpSession session = request.getSession();
		session.setAttribute("majorList", majorList);
		JSONArray arr = new JSONArray(majorList);
		obj.put("list", arr);

		response.setCharacterEncoding("utf-8");
		response.getWriter().write(obj.toString());
		return null;
	}

}
