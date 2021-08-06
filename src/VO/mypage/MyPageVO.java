package VO.mypage;

import java.sql.Date;

public class MyPageVO {
	private String empno;
	private String name;
	private String emp;
	private String position;
	private String phone;
	private Date entrydate;
	private String id;
	
	public void setEmpno(String empno)
	{
		this.empno = empno;
	}
	public String getEmpno()
	{
		return empno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmp(String emp)
	{
		this.emp = emp;
	}
	public String getEmp()
	{
		return emp;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setEntryDate(Date date)
	{
		this.entrydate = date;
	}
	public Date getEntryDate()
	{
		return entrydate;
	}
	public void setID(String id)
	{
		this.id = id;
	}
	public String getID()
	{
		return id;
	}
}
