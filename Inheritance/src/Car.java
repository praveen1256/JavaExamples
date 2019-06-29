
public class Car extends Vehicle{
	
	public void setWheels() {
		numOfWheels = 10;
	}
	
	public void printWheels() {
		System.out.println(numOfWheels);
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		super.details();
		System.out.println("Car Details");
	}

}
