package VO;

public class SignUpVO {
	private String id;
	private String pw;
	private String name;
	private String email;
	private boolean isAdmin;
	
	public void setID(String id)
	{
		this.id = id;
	}
	public String getID()
	{
		return id;
	}
	public void setPW(String pw)
	{
		this.pw = pw;
	}
	public String getPW()
	{
		return pw;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setIsAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}
	public boolean getIsAdmin()
	{
		return isAdmin;
	}
}
