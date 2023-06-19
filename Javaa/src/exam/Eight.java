package exam;
import java.util.Random;
class square extends Thread{
	int x;
	square(int n){
		x=n;
	}
		public void run() 
		{
			int sqr=x*x;
			System.out.println("SQUARE="+sqr);
			
		}
		
	}

class cube extends Thread{
	int x;
	cube(int n){
		x=n;
	}
		public void run(){
		int cub = x*x*x;
		System.out.println("CUBE="+cub);
		
	}
}
class random extends Thread{
	Random random=new Random();
	{
		for(int i=0;i<10;i++)
		{
	int randomInteger=random.nextInt(100);
	System.out.println("RANDOM INTEGER GENERATED:"+randomInteger);
	square s=new square(randomInteger);
	s.start();
	cube c=new cube(randomInteger);
	c.start();
	try {
		Thread.sleep(1000);
		
	}catch(InterruptedException ex) {
		System.out.println(ex);
	}
		
	}
	}
}
	
public class Eight {

	public static void main(String[] args) {
		random n=new random();
		n.start();}
}
