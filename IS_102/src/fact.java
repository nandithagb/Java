import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n,i,fact=1;
System.out.println("enter the number to print factorial");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact+"factorial");
	}

}
