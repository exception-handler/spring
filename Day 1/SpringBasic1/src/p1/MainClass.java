package p1;

public class MainClass {

	public static void main(String[] args) {
		
		
		Vehicle v = VehicleFactory.getVehicle("car");
		vehicleBusinessLogic businessLogic = 
				new vehicleBusinessLogic();
		
		businessLogic.doTask(v);

		
		
	}
}



