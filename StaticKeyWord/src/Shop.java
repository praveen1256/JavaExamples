
public class Shop {
	
	// Static Variable : We can static members directly with class Name. 
	// Only one memory will be alocated
	static int choclateMunch = 30;

	// Instance Variable
	int choclateKitkat = 20;
	
	int tax = 10;

	static int tax1 = 10;
	
	
	// Instance Methods
	public void giveChoclate() {
		System.out.println("Given Cost : 10Rs");
	}
	
	public static void bothCosts() {
		System.out.println("bothCosts");
		
		System.out.println(choclateMunch);
		Shop shp = new Shop();
		System.out.println(shp.choclateKitkat);
		
		int res = shp.choclateKitkat+choclateMunch+Utils.tax;
		Utils.showPopUp("Payment Done");
		
		String login = Utils.BASEURL+"/login";
		
	}
}
