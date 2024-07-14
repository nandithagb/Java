import java.util.*;
public class splittingastringintowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s,large,small;
      
      System.out.println("enter the string");
      s=sc.nextLine();
      String[] arrOfStr =s.split(" ");
      for(String a :arrOfStr)
      		System.out.println(a);
      large=small=arrOfStr[0];
      for (int i=0;i<arrOfStr.length;i++) {
    	  if(small.length()>arrOfStr[i].length())
    	  {
    		  small=arrOfStr[i];
    	  }
    	  if(large.length()<arrOfStr[i].length())
    	  {
    		   large=arrOfStr[i];
    	  }
    	  
      }
      System.out.println("smallest word in the length is"+small);
      System.out.println("largest word in the length is"+large);
      
      
      
	}

}
