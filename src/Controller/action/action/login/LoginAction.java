package Controller.action.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.action.Action;
import Controller.action.MainPageFormAction;
import DAO.login.LoginDAO;
import VO.login.LoginVO;

public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginVO loginVO = new LoginVO();
		loginVO.setID(request.getParameter("id"));
		loginVO.setPW(request.getParameter("pwd"));
		
		LoginDAO loginDao = LoginDAO.getInstance();
		
		String empno = loginDao.selectLogin(loginVO);
		
		// DB 실행 결과 없음 :: DB에 일치하는 {id, pw}가 없음.
		if(empno == null)
		{
			LoginFormAction action = new LoginFormAction();
			action.setError(1);
			action.execute(request, response);
		}
		else
		{
			MainPageFormAction action = new MainPageFormAction();
			action.setEmpno(empno);
			action.execute(request, response);
		}
	}

}
