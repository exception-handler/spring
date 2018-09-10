package p1;

public class Car {

	private String carName;
	private String color;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, String color) {
		super();
		this.carName = carName;
		this.color = color;
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
		return "Car [carName=" + carName + ", color=" + color + "]";
	}
	
	
}
