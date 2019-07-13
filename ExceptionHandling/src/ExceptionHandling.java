
public class ExceptionHandling {

	/*
	 * How to handle exception We to try block,catch block
	 */

	public static void main(String[] args) {
		System.out.println("Exception Handling"); 
		
			try {
				myExceptionImp();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
//		Student student = new Student();
//	
//		if(student.getName()==null) {
//			// show dialog
//		} else {
//		int nameLength = student.getName().length();
//		System.out.println(nameLength);
//		}
//		student.setName("Hello");
//
//		String states = "AP,MP,GU,KE";
//		String statesArray[] = states.split(",");
//
//		try {
//			System.out.println(student.getName().length());
//			System.out.println(statesArray[5]);
//		}catch (NullPointerException e) {
//			// TODO: handle exception
//			System.out.println("Student name is not there");
//			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("Index limit is crossing");
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		int a = 10;
//		int b = 2;
//
//		try {
//			System.out.println(student.getName().length());
//			System.out.println(statesArray[3]);
//			int res = 10/2;
//			int finalAmount = 1000+40;// Error
//		} catch (Exception e) {
//			// TODO: handle exception
//			if (e instanceof NullPointerException)
//				System.out.println("Student name is not there");
//			else if (e instanceof ArrayIndexOutOfBoundsException) {
//				System.out.println("Index limit is crossing");
//			} else if(e instanceof ArithmeticException) {
//				System.out.println("Your are diving with Zero");
//			}
//		} finally {
//			System.out.println("Finally Block");
//		}
		
//		try {
//			// Stmts
//			try {
//				
//			}catch or finally
//			// Stmts
//		} catch or finally
		

	}

	private static void myExceptionImp() throws Exception{
		// TODO Auto-generated method stub
		int item1 = 20;
		int item2 = 40;
		int totalAmount = item1 - item2;
		String name = null;
		
		if(name != null)
			System.out.println(name.length());
		else
			throw new NullPointerException("Name Is Empty");
		
		try {		
		if(totalAmount<item1) {
			throw new LogicException("Calculation Mistake");	
		}
		}catch (LogicException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
