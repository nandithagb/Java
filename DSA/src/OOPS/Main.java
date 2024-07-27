package OOPS;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1= new Student(15,"nandu",85.3f);
//		student1.rno=13;
//		student1.name="NAndu";
//		student1.marks=98.3f;
		System.out.println(student1.marks);
		System.out.println(student1.rno);
		System.out.println(student1.name);
		student1.changename("nanditha");
		student1.greeting();
	}

}
class Student{
	int rno;
	String name;
	float marks;
	void greeting() {
		System.out.println("Hello im nanditha"+" " +this.name);
	}
	void changename(String name) {
		this.name=name;
	}
	Student(){
		this.rno=13;
		this.name="nandu";
		this.marks=98.2f;
	}
	Student(int roll,String naam,float marks){
		rno=roll;
		name=naam;
		this.marks=marks;
	}
}