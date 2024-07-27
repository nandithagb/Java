package PAckage;

public class Human {
 int age;
 String name;
 long salary;
 boolean married;
 static int population;
public Human(int age,String name,long salary,boolean married) {
	this.age=age;
	this.name=name;
	this.salary=salary;
	this.married=married;
	Human.population+=1;
}
}
