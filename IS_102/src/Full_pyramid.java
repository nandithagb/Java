import java.util.Scanner;
import java.util.*;
public class Full_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<=j;i++)
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for (int j=3;j>=i;j--)
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

}