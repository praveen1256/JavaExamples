
public class Bike extends Vehicle{
	
	int noOfWheels = 4;
	
	public void setWheels() {
		
	}
	
	public void printWheels() {
		System.out.println(numOfWheels);
		int res = logic();
	}
	
	@Override
	public void grandDetails() {
		// TODO Auto-generated method stub
		super.grandDetails();
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
//		super.details();
		System.out.println("Bike Details");
	}
	
	@Override
	public int logic() {
		// TODO Auto-generated method stub
		return super.logic();
	}
	
	
	
}
