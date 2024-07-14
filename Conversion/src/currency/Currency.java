package currency;
import java.util.Scanner;
public class Currency {
	double inr,usd,euro,yen;
	Scanner sc=new Scanner(System.in);
	
	public void usdtoinr()

	{
		System.out.println("enter usd to convert into inr");
		usd=sc.nextDouble();
		inr=usd*82.79;
		System.out.println("in dollar:"+usd+"\nin rupee"+inr);
		
		
	}
	public void inrtousd()

	{
		System.out.println("enter currency to convert into usd");
		inr=sc.nextDouble();
		usd=inr/82.79;
		System.out.println("in dollar:"+usd+"\nin rupee"+inr);
		
		
	}
	public void eurotoinr()

	{
		System.out.println("enter euro to convert into inr");
		euro=sc.nextDouble();
		inr=usd*90.11;
		System.out.println("in dollar:"+euro+"\nin rupee"+inr);
		
		
	}
	public void inrtoeuro()

	{
		System.out.println("enter currency to convert into euro");
		inr=sc.nextDouble();
		euro=inr/90.11;
		System.out.println("in dollar:"+euro+"\nin rupee"+inr);
		
		
	}
	public void yentoinr()

	{
		System.out.println("enter yen to convert into inr");
		yen=sc.nextDouble();
		inr=yen*0.62;
		System.out.println("in dollar:"+yen+"\nin rupee"+inr);
		
		
	}
	public void inrtoyen()

	{
		System.out.println("enter currency to convert into yen");
		inr=sc.nextDouble();
	    yen=inr/0.62;
		System.out.println("in dollar:"+yen+"\nin rupee"+inr);
		
		
	}

}