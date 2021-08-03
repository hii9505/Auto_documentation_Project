package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBManager;

public class LoginDAO {
	Connection conn = null;
	
	private void control()
	{
		DBManager db = new DBManager();
		conn = db.dbconnect();
	}
	
	private boolean login_Select()
	{
		String sql = "select * from login";
		ResultSet rs = null;
		
		try
		{
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.executeQuery();
			System.out.println("rs ok");
			
			while(rs.next())
			{
				String a = rs.getString("id");
				String b = rs.getString("pw");
				String c = rs.getString("name");
				String d = rs.getString("email");
				char e = rs.getString("isAdmin").charAt(0);
				
				System.out.println("| | | ");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("쿼리 실패");
			return false;
		}
		return true;
	}
}
