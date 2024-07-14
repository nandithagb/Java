package Distance;
import java.util.Scanner;
public class Distance {
	double km,m,mile;
	Scanner sc=new Scanner(System.in);
	
	public void kmtom()

	{
		System.out.println("enter distance to convert into metre");
		km=sc.nextDouble();
		m=km*1000;
		System.out.println("in km:"+km+"\nin metre"+m);
	}
	public void mtokm()

	{
		System.out.println("enter distance to convert into kilometre");
		m=sc.nextDouble();
		m=km/1000;
		System.out.println("in km:"+km+"\nin metre"+m);
	}
	public void kmtomiles()

	{
		System.out.println("enter distance to convert into metre");
		km=sc.nextDouble();
		mile=km/1.6092;
		System.out.println("in km:"+km+"\nin mile"+mile);
	}
	public void miletokm()

	{
		System.out.println("enter distance to convert into kilometre");
		mile=sc.nextDouble();
		km=mile*1.6092;
		System.out.println("in km:"+km+"\nin miles"+mile);
	}
}