package Conversion;
import currency.*;
import Distance.*;
import Time.*;
import java.util.Scanner;
public class Conversion {
	public static void main (String args[]) {
		int ch;
		Currency c=new Currency();
		Distance d=new Distance();
		Time t=new Time();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			c.usdtoinr();
			break;
		case 2:
			c.inrtousd();
			break;
		case 3:
			c.eurotoinr();
			break;
		case 4:
			c.inrtoeuro();
			break;
		case 5:
			c.yentoinr();
			break;
		case 6:
			c.inrtoyen();
			break;
		case 7:
			d.kmtom();
			break;
		case 8:
			d.mtokm();
			break;
		case 9:
			d.kmtomiles();
			break;
		case 10:
			d.miletokm();
			break;
		case 11:
			t.hrtomin();
			break;
		case 12:
			t.mintohr();
			break;
		case 13:
			t.hrtosec();;
			break;
		case 14:
			t.sectohr();
			break;
        default:
        	System.out.println("Invalid choice");	
		}
		
		
	}
	

}