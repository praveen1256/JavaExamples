
public abstract class Business {
	
	public Business() {
		System.out.println("Business Constructor");
	}

	public Business(String value) {
		// TODO Auto-generated constructor stub
		System.out.println("Business Constructor Param 1");
	}
	
	public void business1() {
		System.out.println("Business 1");
	}
	
	// Instance Methods or Concreate Methods
	public void business2() {
		System.out.println("Business 2");
	}
	
	public abstract void business3();
}
