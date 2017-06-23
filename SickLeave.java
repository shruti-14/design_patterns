package Assignment1Demo;

public class SickLeave implements IUpdateLeave {

	public int updateSickLeave(int sl)
	{
		
		if(0>sl && sl<=2)
		{
			System.out.println("Your limit has reached. Further leaves may lead to penalty");
			return 0;	
		}
		else if(sl>2 && sl<=5)
		{
			System.out.println("Leaves less than 6. Debit: 100");
			return -100;
		}
		else
		{
			System.out.println("Leaves has exceeded their limit. Debit: 500");
			return -500;
		}
		
	}
}