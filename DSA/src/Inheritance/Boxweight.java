package Inheritance;

public class Boxweight extends Box {
double weight;
Boxweight(){
	this.weight=-1;
}
Boxweight(double l,double w,double h,double weight){
	super(l,w,h);
	this.weight=weight;
}
Boxweight(Boxweight other){
	super(other);
	this.weight=-1;
}
Boxweight(double side,double weight){
	super(side);
	this.weight=weight;
}
}
