package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import VO.SignUpVO;
import util.DBManager;

public class SignUpDAO{
	private SignUpDAO() {	
	}
	
	private static SignUpDAO instance = new SignUpDAO();
	
	public static SignUpDAO getInstance()
	{
		return instance;
	}
	
	public void insertSignUp(SignUpVO signUpVO)
	{
		String sql = "INSERT INTO login VALUES(?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try
		{
			conn = new DBManager().dbconnect();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, signUpVO.getID());
			psmt.setString(2, signUpVO.getPW());
			psmt.setString(3, signUpVO.getName());
			psmt.setString(4, signUpVO.getEmail());
			psmt.setInt(5, (signUpVO.getIsAdmin() ? 1 : 0));
			int isupdate = psmt.executeUpdate();
			
			System.out.println(isupdate);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				psmt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
