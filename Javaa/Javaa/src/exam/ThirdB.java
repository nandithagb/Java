package exam;
import java.util.Scanner;
public class ThirdB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		float n1,n2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("choose an operator");
		op=sc.next().charAt(0);
		System.out.println("enter the number1");
		n1=sc.nextInt();
		System.out.println("enter the number 2");
		n2=sc.nextInt();
		switch(op)
		{
		case'+':
			res=n1+n2;
			System.out.println(n1+"+"+n2+"="+res);
			break;
		case'-':
			res=n1-n2;
			System.out.println(n1+"-"+n2+"="+res);
			break;
		case'*':
			res=n1*n2;
			System.out.println(n1+"*"+n2+"="+res);
			break;
		case'/':
			res=n1/n2;
			System.out.println(n1+"/"+n2+"="+res);
			break;
		default:
			System.out.println("invalid operator");
		}
            
	}

}
