
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Methods");
		String loginName = "Kumar";
		char ch = loginName.charAt(1);
		boolean contains =loginName.contains("Ku");
		
		System.out.println(ch);
		System.out.println(contains);
		System.out.println(loginName.length());
	
		String loginUserName = " hello ";
		String loginPassword = " 12345 ";
		
		System.out.println(loginUserName.length());
		loginUserName = loginUserName.trim();
		System.out.println(loginUserName.length());
		
		if(loginPassword.length()>=8) {
			// Call API
		} else {
			System.out.println("Password Should be Min 8 Characters");	
		}
		
		String privacy = "Accept Privacy Terms";
		int pIndex = privacy.indexOf("Privacy Terms");
		System.out.println(pIndex+", "+privacy.length());
		String states = "AP,MP,GU,KE";
		String statesArray[] = states.split(",");
		System.out.println(statesArray[4]);
		
		
		
		
		
	}

}
