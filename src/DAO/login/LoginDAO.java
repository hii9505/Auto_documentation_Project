package DAO.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import VO.login.LoginVO;
import util.DBManager;

public class LoginDAO {
	private LoginDAO() {	
	}
	
	private static LoginDAO instance = new LoginDAO();
	
	public static LoginDAO getInstance()
	{
		return instance;
	}
	
	public String selectLogin(LoginVO loginVo)
	{
		String sql = "SELECT id FROM login WHERE id=? AND pw=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String id = null;
		
		try
		{
			conn = new DBManager().dbconnect();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginVo.getID());
			pstmt.setString(2, loginVo.getPW());
						
			rs = pstmt.executeQuery();
			System.out.println("rs ok");
			
			// 1. 입력받은 id 존재 여부 + 2. 입력받은 id와 pw가 DB 내용과 일치
			while(rs.next())
			{
				id = rs.getString("id");
			}
			
			// 3. 처리
			if(id == null) return id;
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
		return id;
	}
}
