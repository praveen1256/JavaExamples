
public class AbstractClassExample {

	// Abstract it means In-Complete
	// If class contains abstract method then class should be abstract
	// The class may contain 0 or More abstract methods
	// We can't create a method for abstract class directly
	// Interview que : 
	//		Can i create a object of abstract class	-	No
	//		Can i have constructor for abstract class -	Yes
	//      How can i call -	When creating a object of child class it will class the constructor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abstract Class Example");
//		Business customer3 = new Business();
		
		ImpBusiness customer1 = new ImpBusiness();
		customer1.business1();
		customer1.business2();
		customer1.business3();
		
		ChildImp childImp = new ChildImp("");
		System.out.println(childImp.a);
		
		Business customer2 = new ChildImp("Hello");
		customer2.business3();
		
		// Anonymous Inner Type
		Business customer3 = new Business() {
			
			@Override
			public void business3() {
				// TODO Auto-generated method stub
				System.out.println("Business 3 Main");
			}
		};
		
		customer3.business3();
		
		// ImpBusiness2 , Business2
		Business2 business2 = new ImpBusiness2();
		business2.business1();
		business2.businessCalculation(new Clac() {
			
			@Override
			public void add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("Interface Param "+(a+b));
				someMethod();
			}
		},null);
		ImpCalc impCalc = new ImpCalc();
		business2.businessCalculation(impCalc,null);
		
		ImpBusiness3 impBusiness3 = new ImpBusiness3();
		
		
		System.out.print(Business3.a);
//		Business3 business3 = new Business3();
//		business3.a;
		
	}
	
	public static void someMethod() {
		
	}

}
