package p1;

public class Car {

	private String carNumber;
	private String carName;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carNumber, String carName) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + "]";
	}
	
	
	
	
}//end car
