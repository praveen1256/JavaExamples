import newmodel.ModernVehicle;

public class Inheritance {

	/*
	 * static
	 * final
	 * protected
	 * extends
	 * super
	 * */
	
	final static int count = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike1 = new Bike();
		bike1.details();
		
		Car car1 = new Car();
		car1.details();
		
		System.out.println("************");
		
		byte val = 127;
		byte val1 = 127;
//		byte res = val + val1;
		
		int a = 10;
		int b = 20;
		int res1 = a+b;
		
//		Vehicle vehicle = new Bike();
//		Vehicle vehicle = new Car();
		Vehicle vehicle = new Vehicle();
		
		vehicle.details();// Dynamic Polymorpism
		
		System.out.println("************");
		System.out.println(count);
		
	}

	
	
}
