package DAO.mydocument;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import VO.reportlist.WorkReportListVO;
import util.DBManager;

public class WorkReportDAO {
	private WorkReportDAO() {
		
	}
	
	private static WorkReportDAO instance = new WorkReportDAO();
	
	public static WorkReportDAO getInstance()
	{
		return instance;
	}
	
	public String selectReportList(WorkReportListVO reportListVo)
	{
		String sql = "SELECT * FROM *";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			conn = new DBManager().dbconnect();
			pstmt = conn.prepareStatement(sql);
			/*
			 * pstmt.setString(1, reportListVo.getName());
			 * 
			 */
			
			rs = pstmt.executeQuery();
			System.out.println("rs ok");
			
			while(rs.next())
			{
				// 입력받은 query를 배열에 저장
			}
			
			// 입력받은 값이 없을 경우 처리
			
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
		
		return null;
	}
}
