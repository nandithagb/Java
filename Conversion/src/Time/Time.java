package Time;
import java.util.Scanner;
public class Time {
	double hr,min,sec;
	Scanner sc=new Scanner(System.in);
	
	public void hrtomin()

	{
		System.out.println("enter time in hours to convert into minutes");
		hr=sc.nextDouble();
		min=hr*60;
		System.out.println("in hour:"+hr+"\nin min"+min);
	}
	public void mintohr()

	{
		System.out.println("enter time in minutes to convert into hours");
		min=sc.nextDouble();
		hr=min/60;
		System.out.println("in hour:"+hr+"\nin min"+min);
	}
	public void hrtosec()

	{
		System.out.println("enter time in hours to convert into sec");
		hr=sc.nextDouble();
		sec=hr*3600;
		System.out.println("in hour:"+hr+"\nin min"+min);
	}
	public void sectohr()

	{
		System.out.println("enter time in sec to convert into hours");
		sec=sc.nextDouble();
		hr=min/3600;
		System.out.println("in hour:"+hr+"\nin min"+sec);
	}
}
