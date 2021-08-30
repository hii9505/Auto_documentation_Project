package Controller.action.mydocument;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.action.Action;
import DAO.login.LoginDAO;
import VO.login.LoginVO;
import VO.reportlist.WorkReportListVO;

public class WorkReportListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		WorkReportListVO reportListVo = new WorkReportListVO();
		
		
		/*
		LoginVO loginVO = new LoginVO();
		loginVO.setID(request.getParameter("id"));
		loginVO.setPW(request.getParameter("pwd"));
		
		LoginDAO loginDao = LoginDAO.getInstance();
		
		String id = loginDao.selectLogin(loginVO);
		*/
		
		HttpSession session = request.getSession();
		String url = "/MyDocument/WorkReportList.jsp";
		
		
		/*
		HttpSession session = request.getSession();
		
		MyPageVO mypageVo = new MyPageVO();
		mypageVo.setEmpno(request.getParameter("empno"));
		mypageVo.setName(request.getParameter("name"));
		mypageVo.setEmp(request.getParameter("emp"));
		mypageVo.setPosition(request.getParameter("position"));
		mypageVo.setPhone(request.getParameter("phone1") + request.getParameter("phone2") + request.getParameter("phone3"));
		mypageVo.setEntryDate(Date.valueOf(request.getParameter("entrydate")));
		mypageVo.setID((String)session.getAttribute("ID"));
		
		session.setAttribute("EMPNO", mypageVo.getEmpno());
		
		MyPageDAO mypageDao = MyPageDAO.getInstance();
		if(((String)session.getAttribute("DB_EXIST")).equals("1"))
			mypageDao.updateMypage(mypageVo);
		else
			mypageDao.insertMypage(mypageVo);
		
		new MainPageFormAction().execute(request, response);
		*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
