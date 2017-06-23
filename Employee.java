package Assignment1Demo;

public class Employee {

	private int sso,sickleave_count;
	private String ename;
	protected String designation;
	
	public int getSSO() 
	{
		return sso;
	}
	public void setSSO(int SSO) 
	{
		this.sso = SSO;
	}
	
	public int getSickleave_count() 
	{
		return sickleave_count;
	}
	public void setSickleave_count(int sickleave_count) 
	{
		this.sickleave_count = sickleave_count;
	}
	
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	
	//@Override
	public String toString() {
		return "Employee [sso=" + sso + ", sickleave_count=" + sickleave_count + ", ename=" + ename + ", designation="
				+ designation + "]\n";
	}

	
}
