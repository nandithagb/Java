package Interface;

public class Nicecar {
	private Engine engine;
	private Media_Player player =new Cdplayer();
	public Nicecar() {
		// TODO Auto-generated constructor stub
		engine= new PowerEngine();
	}
	public Nicecar(Engine engine) {
		this.engine=engine;
	}
	public void start() {
		engine.start();
	}
	public void stop() {
		engine.stop();
	}
	public void StartMusic() {
		player.start();
	}
	public void StopMusic() {
		player.stop();
	}
	public void change() {
		this.engine=new ElectricEngine();
	}
}
