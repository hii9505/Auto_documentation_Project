package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private String id = "class4";
	private String pw = "1234";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public Connection dbconnect()
	{		
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결 성공!");
		}
		catch(SQLException e)
		{
			System.out.println("DB 계정 불일치");
			e.printStackTrace();
			return null;
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("DB 연결실패");
			e.printStackTrace();
			return null;
		}
		return conn;
	}
}
