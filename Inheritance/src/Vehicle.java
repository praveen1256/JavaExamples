
public class Vehicle extends NewVehicleModel{
	
	int numOfWheels;
	int model;
	String company;

	public void details() {
		System.out.println("Vehicle Details");
		// Imp logic
	}
	
	public int logic() {
		super.logic();
		return numOfWheels+model;
	}
	
	@Override
	public void grandDetails() {
		// TODO Auto-generated method stub
		super.grandDetails();
	}
	
}
