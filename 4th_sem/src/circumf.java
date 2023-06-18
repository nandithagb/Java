import java.util.Scanner;
public class circumf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        double r,cir,area;
        System.out.println("enter the radius");
        r=sc.nextInt();
        cir=2*3.14*r;
        area=3.14*r*r;
        System.out.println("circumference="+cir);
        System.out.println("area="+area);
	}

}
