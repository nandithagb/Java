import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
char op=sc.next().charAt(0);
if(op=='+') {
	System.out.println(n1 +" + "+n2+" = "+ (n1+n2));
}
else if(op=='-') {
	System.out.println(n1 +" - "+n2+" = "+ (n1-n2));
}
else if(op=='*') {
	System.out.println(n1 +" * "+n2+" = "+ (n1*n2));
}
else {
	if(n2==0) {
		System.out.println("division not possible");
	}
	else {
		System.out.println(n1 +" * "+n2+" = "+ (n1/n2));
	}
}
	}

}
