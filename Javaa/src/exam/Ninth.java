package exam;
import java.util.*;
import java.io.*;
public class Ninth {
public static void main(String[] args)throws IOException{
			ArrayList s=new ArrayList();
			DataInputStream d=new DataInputStream(System.in);
			int c,ch;
			int i,j;
			String str,str1;
			do {
				System.out.println("STRING MANIPULATION\n");
				System.out.println("=======================================================\n");
				System.out.println("1.APPEND AT END\n");
				System.out.println("2.INSERT AT PARTICULAR INDEX\n");
				System.out.println("3.SEARCH\n");
				System.out.println("4.LIST STRING THAT STARTING WITH LETTER\n");
				System.out.println("5.SIZE\n");
				System.out.println("6.REMOVE\n");
				System.out.println("7.SORT\n");
				System.out.println("8.DISPLAY\n");
				System.out.println("========================================================\n");
				c=Integer.parseInt(d.readLine());
				switch(c) {
				case 1:{
					System.out.println("enter the string");
					str=d.readLine();
					s.add(str);
					break;
				}
				case 2:{
					System.out.println("enter the string:");
					str=d.readLine();
					i=Integer.parseInt(d.readLine());
					s.add(i-1,str);
				}case 3:{
					System.out.println("enter the charecter list string that starts:");
					str=d.readLine();
					j=s.indexOf(str);
					if(j==-1) {
						System.out.println("Element not found");
					}
					else {
						System.out.println("index of:"+str+"is"+j);
						break;
				
					
						}
					}
				
				case 4:
				{
					System.out.println("enter the charecter:");
					str=d.readLine();
					for(i=0;i<(s.size()-1);i++)
					{
						str1=(String)s.get(i);
						if (str1.startsWith(str)) {
							System.out.println(str1);
							break;
						}
						else
							System.out.println("not found!");
					}
					break;
						
					
				}
				case 5:{
					System.out.println("size of the list:"+s.size());
					break;
				}
				case 6:
				{
					System.out.println("enter the element to remove:");
					str=d.readLine();
					if(s.remove(str)) {
						System.out.println("element removed:"+str);
					}
					else {
						System.out.println("element not found");
					}
					break;
				}
				case 7:{
					Collections.sort(s);
					System.out.println("THE ARRAY LIST HAS FOLLOWING ELEMENTS:"+s);
					break;
				}
				case 8:{
					System.out.println("THE ARRAY ELEMENTS ARE"+s);
					break;
				}
				}
				System.out.println("enter 1or 0");
				ch=Integer.parseInt(d.readLine());
			}
				while(ch==1);
					}
			
		

	}