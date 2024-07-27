package Interface;

public class Car implements Engine,Brake{
@Override
public void acc() {
	// TODO Auto-generated method stub
	System.out.println("i am accelrating like normal car");
	
}
@Override
	public void brake() {
		// TODO Auto-generated method stub
	System.out.println("i am brake like normal car");
		
	}
@Override
	public void start() {
		// TODO Auto-generated method stub
	System.out.println("i am start like normal car");
		
	}
@Override
	public void stop() {
		// TODO Auto-generated method stub
	System.out.println("i am stop like normal car");
		
	}
}
