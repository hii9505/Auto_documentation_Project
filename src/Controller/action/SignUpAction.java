package Controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SignUpDAO;
import VO.SignUpVO;

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
		
		// new MainPageAction().execute(request, response);
	}

}
