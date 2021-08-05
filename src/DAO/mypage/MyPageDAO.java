package DAO.mypage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import VO.mypage.MyPageVO;
import util.DBManager;

public class MyPageDAO {
	private MyPageDAO(){
	}
	
	private static MyPageDAO instance = new MyPageDAO();
	
	public static MyPageDAO getInstance()
	{
		return instance;
	}
	
	// mypage select문 (MainPage에서 MyPage 접속 시 호출)
	public void selectMypage(MyPageVO mypageVo)
	{
		String sql = "SELECT * FROM private_info";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			conn = new DBManager().dbconnect();
			pstmt = conn.prepareStatement(sql);
			
			/*
			 * SQL 내용 추가
			 */
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("쿼리 실패");
		}
		finally
		{
			try
			{
				rs.close();
				pstmt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	// mypage insert문 (LoginPage에서 MyPage 접속 시 호출)
	public void insertMypage(MyPageVO mypageVo)
	{
		String sql = "INSERT INTO private_info VALUES(?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try
		{
			conn = new DBManager().dbconnect();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mypageVo.getEmpno());
			pstmt.setString(2, mypageVo.getName());
			pstmt.setString(3, mypageVo.getEmp());
			pstmt.setString(4, mypageVo.getPosition());
			pstmt.setLong(5, mypageVo.getPhone());
			pstmt.setDate(6, mypageVo.getEntryDate());
			pstmt.setString(7, mypageVo.getID());
			pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("쿼리 실패");
		}
		finally
		{
			try
			{
				pstmt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
