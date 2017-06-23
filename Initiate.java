package Assignment1Demo;


import static org.junit.Assert.assertSame;

import java.util.Random;

public class Initiate {

	public static void main(String[] args) throws CloneNotSupportedException{
	// TODO Auto-generated method stub
	
		Onboarding r2 = new Onboarding();
		System.out.println(r2);
		
		r2.OnboardingProcess(r2);
		System.out.println(r2);

	//Prototype pattern - shallow copy r1 from original r2 	
		System.out.println("Now control is at Admin:");
		
		Onboarding r1 = (Onboarding)r2.clone(); 
		System.out.println(""+r1);
		
	//assertSame(r2,r1);
		
	//updating sickleave in shallow copy 
		Random ran = new Random();
		int bon[] = new int[r1.getEmployee_List().size()]; //to save bonus for each employee sequentially
		int salary[] = new int[r1.getEmployee_List().size()]; //to save salary for each employee sequentially
		
		for(int j=0;j<r1.getEmployee_List().size();j++)
		{
			int rn = ran.nextInt(10); 
			r1.getEmployee_List().get(j).setSickleave_count(rn);
			

		//Strategy Pattern -- NoSickLeave and SickLeave are concrete classes (encapsulating algorithms for composition)
			//calculating penalty for excess leave using shallow copy data
			int sl = r1.getEmployee_List().get(j).getSickleave_count();
			System.out.println("sso: "+j+", no. of sick leaves: "+sl);
			int bonus = 0; 
			if(sl==0)
			{
				bonus = new NoSickLeave().updateSickLeave(0);
			}
			else
			{
				bonus = new SickLeave().updateSickLeave(sl);
			}
			bon[j] = bonus; 	
			salary[j] = 3000 + bon[j];
		}
		System.out.println("\nContents in original");
		System.out.println("Final employee list :\n"+r2);
		
		//display of final Employee_List 
		System.out.println("\nContents in copy");
		System.out.println(r1);
		
		//displaying bonus and salary
		System.out.println();
		for(int i=0;i<r1.getEmployee_List().size();i++)
		{
			System.out.println("sso:"+(i+1)+", Bonus:"+bon[i]+", Total Salary:"+salary[i]);
		}
		return;
	}
}
