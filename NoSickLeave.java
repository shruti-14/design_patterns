package Assignment1Demo;

public class NoSickLeave implements IUpdateLeave {

	public int updateSickLeave(int sl)
	{
		System.out.println("No leave taken. Credit : 500");
		return 500;
	}
}
