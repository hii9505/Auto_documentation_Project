package Controller.action.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.action.Action;
import DAO.login.SignUpDAO;
import VO.login.SignUpVO;

public class SignUpAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SignUpVO signUpVO = new SignUpVO();
		signUpVO.setID(request.getParameter("id"));
		signUpVO.setPW(request.getParameter("pwd"));
		signUpVO.setName(request.getParameter("user_name"));
		signUpVO.setEmail(request.getParameter("email"));
		signUpVO.setIsAdmin(false);
		
		SignUpDAO signUpDao = SignUpDAO.getInstance();
		signUpDao.insertSignUp(signUpVO);
		
		new LoginFormAction().execute(request, response);
	}

}
