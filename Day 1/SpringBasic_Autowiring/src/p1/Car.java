package p1;

import java.util.List;

public class Car {

	private String carName;
	private String color;
	private Engine engine;
	private List<Tyer> tyers;
	private MusicSystem ms;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, String color) {
		super();
		this.carName = carName;
		this.color = color;
	}
	
	
	
	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}

	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<Tyer> getTyers() {
		return tyers;
	}
	public void setTyers(List<Tyer> tyers) {
		this.tyers = tyers;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", color=" + color + ", engine=" + engine + ", tyers=" + tyers + ", ms=" + ms
				+ "]";
	}
	
}
