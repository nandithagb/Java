package exam;
import java.util.Scanner;
class staff{
    String id, name;
    long phno;
    int sal;
    void read_data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  name:-");
        name=sc.next();
        System.out.println("Enter  id:-");
        id=sc.next();
        System.out.println("Enter  phone number:-");
        phno=sc.nextLong();
        System.out.println("Enter  Salary:-");
        sal=sc.nextInt();
    }
    void display(){
        System.out.println("Name-"+name+"\tStaff ID-"+id+"\tPhone number-"+phno+"\tSalary-"+sal);
    }
}
class teachings extends staff{
    String dom,publi;
    void read_data(){
        super.read_data();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Teacher's domain:-");
        dom=sc.next();
        System.out.println("Enter Teacher's publications :-");
        publi=sc.next();
    }
    void display(){
        super.display();
        System.out.println("Domain-"+dom+"\tPublications-"+publi);
    }

}
class technical extends staff{
    String skills;
    void read_data(){
        super.read_data();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  skills:-"); 
        skills=sc.next();
    }
    void display(){
        super.display();
        System.out.println("Skills-"+skills);
    }

}
class contract extends staff{
    int period;
    void read_data(){
        super.read_data();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  contract period:-");
        period=sc.nextInt();
    }
    void display(){
        super.display();
        System.out.println("Period-"+period);
    }

}
public class Fourth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter number of teaching staff-");
        n1=sc.nextInt();
        teachings t1[]=new teachings[n1];
        for(int i=0;i<n1;i++){
            t1[i]=new teachings();
            t1[i].read_data();
        }
        System.out.println("Enter number of technical staff-");
        n2=sc.nextInt();
        technical t2[]=new technical[n2];
        for(int i=0;i<n2;i++){
            t2[i]=new technical();
            t2[i].read_data();
        }
        System.out.println("Enter number of contract staff-");
        n3=sc.nextInt();
        contract t3[]=new contract[n3];
        for(int i=0;i<n3;i++){
            t3[i]=new contract();
            t3[i].read_data();
        }
        System.out.println("Teaching staff-");
        for(int i=0;i<n1;i++){
            t1[i].display();
        }
        System.out.println("Technical staff-");
        for(int i=0;i<n2;i++){
            t2[i].display();
        }
        System.out.println("Contract staff-");
        for(int i=0;i<n3;i++){
            t3[i].display();
        }
    }
}