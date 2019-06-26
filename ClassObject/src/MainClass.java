import clac.Calc;
import clac.Login;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Syntax Class : <ClassName> <VaribaleName> = new <ClassName>();
		Calc clac = new Calc();
		clac.gst = 20;
		clac.printGst();
		
		Calc clac2 = new Calc();
		clac2.printGst();
		clac.add(10, 20);
		clac.mul(10, 20);
		
		int result = clac.sub(20, 10);
		Login login = new Login();
		String loginUserName = login.login("Kumar");
		// Some Logic 
		
		// Naviage to home screen (loginUserName)
		
		System.out.println(result);
		System.out.println(clac.hashCode());
		System.out.println(clac2.hashCode());
		if(clac.hashCode()==clac2.hashCode()) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		
	}

}
