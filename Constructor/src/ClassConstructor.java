
public class ClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ClassConstructor");
		
		// classname instance/object = new(keyword) classConstructor();
		// Constructor - 
		//		Class name and Constructor name should be same is not it will consider as method
		//		It wont have any retun type
		//		Syntax :	
		//			access-specifier <ClassName>(){
		//			}
		
		Person person1 = new Person();	
		
		person1.setName("Kumar");
		person1.setNativePlace("Hyd");
		person1.setAge("9");
		person1.whoAreYou();
		person1.urNamePlace();
		
		
		person1.setNativePlace("Uppal");
		MainBus mainBus = new MainBus();
		mainBus.setBusFee(400);
		person1.setBus(mainBus);
		person1.urNamePlace();
		person1.yourBusFee();
		
		Person person2 = new Person("Madhu","Sec");
		person2.setAge("8");
		person2.urNamePlace();
		
		Person person3 = new Person("Madhu2","Sec","10");
		person3.urNamePlace();
		
		MiniBus miniBus = new MiniBus();
		miniBus.busFee(100);
		Person person4 = new Person("Hari","Sec","10",miniBus);
		person4.urNamePlace();
		person4.yourBusFee();
		
		MiniBus mainBus2 = new MiniBus();
		mainBus2.busFee(200);
		Person person5 = new Person("Venakat","Sec","10",mainBus2);
		person5.urNamePlace();
		person5.yourBusFee();
		
	}

}
