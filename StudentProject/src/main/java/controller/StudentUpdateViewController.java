package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.StudentDTO;
import service.StudentService;
import view.ModelAndView;

public class StudentUpdateViewController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView view = null;
		String studentNo = request.getParameter("studentNo");
		StudentDTO dto = StudentService.getInstance().selectStudent(studentNo);
		
		if(dto == null) {
			//수정할 학생정보가 없을 때
			response.setContentType("text/html; charset=utf-8");
			PrintWriter pw = response.getWriter();
			pw.write("<script>alert('"+studentNo+"학번 데이터가 없습니다.');location.href='main.do';</script>");
		}else {
			//수정할 학생정보가 있을 때
			request.setAttribute("dto", dto);
			view = new ModelAndView("student_update.jsp", false);
		}

		return view;
	}

}





