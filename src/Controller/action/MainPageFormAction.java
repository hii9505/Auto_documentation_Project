package Controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainPageFormAction implements Action{
	
	private String empno = null;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String url = "/MainPage/MainPage.jsp";
		
		request.setAttribute("EMPNO", getEmpno());
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	public void setEmpno(String empno)
	{
		this.empno = empno;
	}
	private String getEmpno()
	{
		return empno;
	}
}
