package p1;

import java.util.List;

public class Car {

	private String carName;
	private String color;
	private Engine e;
	private List<Tyer> tyers;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, String color) {
		super();
		this.carName = carName;
		this.color = color;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
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
		return "Car [carName=" + carName + ", color=" + color + ", e=" + e + ", tyers=" + tyers + "]";
	}
	
	
}
