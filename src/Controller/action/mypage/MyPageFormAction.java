package Controller.action.mypage;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.action.Action;
import Controller.action.MainPageFormAction;
import DAO.mypage.MyPageDAO;
import VO.mypage.MyPageVO;

public class MyPageFormAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		MyPageVO mypageVo = new MyPageVO();
		mypageVo.setID((String)session.getAttribute("ID"));
		
		MyPageDAO mypageDao = MyPageDAO.getInstance();
		mypageDao.selectMypage(mypageVo);
		
		request.setAttribute("EMPNO", mypageVo.getEmpno());
		request.setAttribute("NAME", mypageVo.getName());
		request.setAttribute("EMP", mypageVo.getEmp());
		request.setAttribute("POSITION", mypageVo.getPosition());
		request.setAttribute("PHONE", mypageVo.getPhone());
		request.setAttribute("ENTRYDATE", mypageVo.getEntryDate());
		
		
		if(mypageVo.getEmpno() != null)
			request.setAttribute("DB_EXIST", "1");
		else
			request.setAttribute("DB_EXIST", "0");
		
		String url = "/MyPage/MyPage.jsp";	
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
