package p1;

public class VehicleFactory {

	public static Vehicle getVehicle(String type)
	{
		Vehicle v = null;
		if(type.equals("car"))
		{
			v = new Car();
			return v;
		}
		else if(type.equals("jetplane"))
		{
			v = new JetPlane();
			return v;
		}
		else return null;
		
	}
}
