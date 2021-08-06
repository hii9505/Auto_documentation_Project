package Controller.action.mypage;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.action.Action;
import DAO.mypage.MyPageDAO;
import VO.mypage.MyPageVO;

public class MyPageAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		MyPageVO mypageVo = new MyPageVO();
		mypageVo.setEmpno(request.getParameter("empno"));
		mypageVo.setName(request.getParameter("name"));
		mypageVo.setEmp(request.getParameter("emp"));
		mypageVo.setPosition(request.getParameter("position"));
		mypageVo.setPhone(Long.parseLong(request.getParameter("phone1") + request.getParameter("phone2") + request.getParameter("phone3")));
		mypageVo.setEntryDate(Date.valueOf(request.getParameter("entrydate")));
		mypageVo.setID((String)session.getAttribute("ID"));
		
		MyPageDAO mypageDao = MyPageDAO.getInstance();
		mypageDao.insertMypage(mypageVo);
		
		new MainPageFormAction().execute(request, response);
	}
}
