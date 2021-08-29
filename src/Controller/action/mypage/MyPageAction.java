package Controller.action.mypage;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.action.Action;
import Controller.action.MainPageFormAction;
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
		mypageVo.setPhone(request.getParameter("phone1") + request.getParameter("phone2") + request.getParameter("phone3"));
		mypageVo.setEntryDate(Date.valueOf(request.getParameter("entrydate")));
		mypageVo.setID((String)session.getAttribute("ID"));
		
		session.setAttribute("EMPNO", mypageVo.getEmpno());
		
		MyPageDAO mypageDao = MyPageDAO.getInstance();
		String temp = (String)session.getAttribute("DB_EXIST");
		if(((String)session.getAttribute("DB_EXIST")).equals("1"))
			mypageDao.updateMypage(mypageVo);
		else
			mypageDao.insertMypage(mypageVo);
		
		new MainPageFormAction().execute(request, response);
	}
}
