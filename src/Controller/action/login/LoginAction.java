package Controller.action.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.action.Action;
import Controller.action.mypage.MyPageFormAction;
import DAO.login.LoginDAO;
import VO.login.LoginVO;

public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginVO loginVO = new LoginVO();
		loginVO.setID(request.getParameter("id"));
		loginVO.setPW(request.getParameter("pwd"));
		
		LoginDAO loginDao = LoginDAO.getInstance();
		
		String id = loginDao.selectLogin(loginVO);
		
		// DB 실행 결과 없음 :: DB에 일치하는 {id, pw}가 없음.
		if(id == null)
		{
			LoginFormAction action = new LoginFormAction();
			action.setError(1);
			action.execute(request, response);
		}
		else
		{
			HttpSession session = request.getSession();
			session.setAttribute("ID", id);
			MyPageFormAction action = new MyPageFormAction();
			action.execute(request, response);
		}
	}

}
