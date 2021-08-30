package VO.reportlist;

public class WorkReportListVO {
	private String name;
	private String empno;
	private String startTime;
	private String endTime;
	private String workReportNo;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setEmpno(String empno)
	{
		this.empno = empno;
	}
	public String getEmpno()
	{
		return empno;
	}
	
	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}
	public String getStartTime()
	{
		return startTime;
	}
	
	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}
	public String getEndTime()
	{
		return endTime;
	}
	
	public void setWorkReportNo(String workReportNo)
	{
		this.workReportNo = workReportNo;
	}
	public String getWorkReportNo()
	{
		return workReportNo;
	}
}
