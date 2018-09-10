package p1;

public class CarRentalService {
	private Car car;
	private Driver driver;
	
	public CarRentalService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarRentalService(Car car, Driver driver) {
		super();
		this.car = car;
		this.driver = driver;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "CarRentalService [car=" + car + ", driver=" + driver + "]";
	}
	public void bookCar()
	{
		System.out.println(car);
		System.out.println(driver);
	}
	
	public void doSomeThing(int i,String x)
	{
		
	}
	
	public void doExtraWork(Car x)
	{
		
		Car c = null;
		System.out.println("A");
		if(c == null)
		{
			throw new NullPointerException(" Car Test Null Case ");
		}
		else {
			System.out.println(c.getCarName());
		}
		
		System.out.println("B");
		
	}
	
	
	
}










