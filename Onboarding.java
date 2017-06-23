package Assignment1Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Onboarding implements IBroadcast,Cloneable {

	Scanner sc = new Scanner(System.in);
	//the subject observed is List and Hr and Manager are observers -- Observer Pattern
	List<Employee> Employee_List = new ArrayList<>();

	public List<Employee> getEmployee_List() {
		return Employee_List;
	}

	public void setEmployee_List(List<Employee> employee_List) {
		Employee_List = employee_List;
	}
	 
	public void OnboardingProcess(Onboarding a)
	{
		//Entry of existing employee
		Employee e1 = new Employee();
		e1.setSSO(1);
		e1.setEname("XYZ");
		e1.setDesignation("SE");
		a.getEmployee_List().add(e1);	
		System.out.println(a);
		
		//Entering new employees in list
		System.out.println("Do you want to continue entry in employee list: Y or N?");
		String ans = sc.next();
		while(ans.equalsIgnoreCase("Y"))
		{			
			a.formatList();
			System.out.println(a);
	    	a.sendToHr();
	    	a.sendToManager();
	    	System.out.println("Do you want to continue entry in employee list: Y or N?");
	    	ans = sc.next();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void formatList()
	{
			int count;
			count = Employee_List.size();
			System.out.println("Enter the number of new employees:");
			int newcount = sc.nextInt();
			for(int i=0;i<newcount;i++)
			{
				Employee e1 = new Employee();
				e1.setSSO(++count);
				String temp1;
				System.out.println("Enter name of employee "+(i+1));
				temp1 = sc.next();
				e1.setEname(temp1);
				System.out.println("Enter designation of employee "+(i+1));
				temp1 = sc.next();
				e1.setDesignation(temp1);
				e1.setSickleave_count(0);
				getEmployee_List().add(e1);
			}
		//sc.close();
	}
		
	@Override
	public void sendToHr() {
		// TODO Auto-generated method stub
		System.out.println("HR being notified about new entries of employees.");
	}
	
	public void sendToManager() {
		// TODO Auto-generated method stub
		System.out.println("Manager being notified about new entries of employees.");
	}

	@Override
	public String toString() {
		return "Onboarding\n [Employee_List=\n" + Employee_List + "]";
	}
	
}
