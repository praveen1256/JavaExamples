
public class Person {
	
	String name;
	String nativePlace;
	String age;
	Bus bus;
	
	public Person(){
		System.out.println("I'm Person Empty Constructor");
	}
	
	public Person(String name, String nativePlace) {
		this.name = name;
		this.nativePlace = nativePlace;
	}

	public Person(String name, String nativePlace,String age) {
		this.name = name;
		this.nativePlace = nativePlace;
		this.age = age;
	}
	
	public Person(String name, String nativePlace,String age,Bus bus) {
		this.name = name;
		this.nativePlace = nativePlace;
		this.age = age;
		this.bus = bus;
	}
	
	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public void whoAreYou() {
		System.out.println("I'm Person Class Method");
	}
	
	public void urNamePlace() {
		System.out.println(name+", "+nativePlace+", "+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void yourBusFee() {
		System.out.println(name+" is coming from "+nativePlace+" his fee is "+bus.getBusFee());
	}
	
	

}
