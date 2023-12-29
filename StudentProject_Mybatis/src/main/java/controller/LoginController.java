package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import config.MybatisManager;
import view.ModelAndView;

public class LoginController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView view = null; 
		//아이디, 패스워드 값 읽어옴
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		//아이디/패스워드 체크
		if(id.equals("admin") && passwd.equals("123456")) {
			//로그인 성공시
			//세션에 데이터 설정
			HttpSession session = request.getSession();
			session.setAttribute("login", true);
			
			//경로이동
			view = new ModelAndView("main.do", true);
		}else {
			//로그인 실패했을때
			//경로이동
			view = new ModelAndView("index.jsp", true);
		}
		return view;
	}

}




