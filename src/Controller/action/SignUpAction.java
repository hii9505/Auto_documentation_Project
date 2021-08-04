package Controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SignUpDAO;
import VO.SignUpVO;

public class SignUpAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String url = LoginPage/Login.jsp
		SignUpVO signUpVO = new SignUpVO();
		signUpVO.setID(request.getParameter("id"));
		signUpVO.setPW(request.getParameter("pwd"));
		signUpVO.setName(request.getParameter("user_name"));
		signUpVO.setEmail(request.getParameter("email"));
		signUpVO.setIsAdmin(false);
		
		SignUpDAO signUpDao = SignUpDAO.getInstance();
		signUpDao.insertSignUp(signUpVO);
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		
		// new MainPageAction().execute(request, response);
	}

}
