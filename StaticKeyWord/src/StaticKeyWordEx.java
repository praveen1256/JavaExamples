
public class StaticKeyWordEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop chustomer1 = new Shop();
		
		chustomer1.giveChoclate();
		
		System.out.println("Cust 1");
		System.out.println("Before");
		System.out.println(chustomer1.choclateKitkat);
		System.out.println(Shop.choclateMunch);
		Shop.choclateMunch = 40;//30-40
		chustomer1.choclateKitkat = 50;// 20-50
		System.out.println("After");
		
		System.out.println(chustomer1.choclateKitkat);
		System.out.println(Shop.choclateMunch);

		System.out.println("**************");
		System.out.println("Cust 2");
		Shop chustomer2 = new Shop();
		System.out.println(chustomer2.choclateKitkat);
		System.out.println(Shop.choclateMunch);
		
		Shop.bothCosts();
		Shop.tax1 = 20;
		// 20
		
		
	}
	
	public void createObj()
	{
		Shop chustomer1 = new Shop();
//		Shop.tax1 = 20;
		chustomer1.tax = 30;
	}
	
	public void createObj2()
	{
		Shop chustomer1 = new Shop();
		chustomer1.tax = 30;
	}
	
	public void createObj3()
	{
		Shop chustomer1 = new Shop();
		chustomer1.tax = 30;
	}
	

}
