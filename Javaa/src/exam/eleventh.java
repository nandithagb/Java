package exam;
import java.util.*;
import java.io.*;
public class eleventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner s=new Scanner(System.in);
				System.out .println("enter the file name:");
				String file_name=s.nextLine();
				File f=new File(file_name);
				if(f.exists()) {
					System.out .println("THE FILE"+file_name+"exits");
				}
				else {
					System.out .println("the file does not eixts");}
				
				if(f.exists()) {
					if(f.canRead()) {
						System.out .println("THE FILE"+file_name+"CAN READ");
					}
					else {
						System.out .println("THE FILE CANNOT BE READ");}
					if(f.canWrite()) {
						System.out .println("THE FILE"+file_name+"CAN BE WRITTEN");
					}
					else {
						System.out .println("THE FILE CANNOT BE WRITTEN");}
					System.out.println("THE FILE type of the file is "+file_name.substring(file_name.indexOf('.')+1));
					System.out.println("THE LENGTH OF FILE IS "+f.length());
					}
				}

			
	}


