package Controller.action.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.action.Action;

public class LoginFormAction implements Action{
	private int erro_no = 0;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("ERROR", getError());
		
		String url = "/LoginPage/Login.jsp";	
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
	public void setError(int i)
	{
		this.erro_no = i;
	}
	private int getError()
	{
		return erro_no;
	}
}
