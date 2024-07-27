package Inheritance;

public class Box {
     double l;
     double h;
     double w;
     Box(){
    	 this.h=-1.0;
    	 this.l=-1.0;
    	 this.w=-1.0;
     }
     Box(double side){
    	 this.h=side;
    	 this.l=side;
    	 this.w=side;
     }
     Box(double l,double w,double h){
    	 this.h=l;
    	 this.l=w;
    	 this.w=h;
     }
     Box(Box old){
    	 this.h=old.h;
    	 this.l=old.l;
    	 this.w=old.w;
     }
     public void information() {
    	 System.out.println("Running the box");
     }
}
