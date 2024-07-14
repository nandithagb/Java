import java.io.*;
import java.util.Scanner;
public class Demo{
  
   
   public static void main(String args[]){
      int num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      System.out.println("The number of set bits in num is ");
      int count = 0,i,sum=0,x;
   
      for( i=1;i<num;i++)
      {
          count=0;
        while (i > 0){
           i &= (i - 1);
           count++;
        }
        sum=sum+count;
        System.out.println("sum="+sum);
      }
      
   
     
   }
}
