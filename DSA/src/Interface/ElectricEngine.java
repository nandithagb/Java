package Interface;

public class ElectricEngine implements Engine{
	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("electric accel");
		
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("electric start");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("electric stop");
		
	}

}
