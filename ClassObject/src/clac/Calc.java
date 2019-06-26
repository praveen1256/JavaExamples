package clac;

public class Calc {
	
//	Syntax Variable : <Data Type> <Variable Name> = <Value>;
	
//	Syntax Method : 
//	<access specifier> <static/non static> <final/non final> <return type> <method name> (<parameters>)(){}
	
	public int gst = 10;
	
	public void add(int value1,int value2) {
		int result = value1 + value2;
		sop(result,"Addition");
	}
	
	public void add(int value1,float value2) {
		float result = value1 + value2;
		sop(result,"Addition");
	}
	
	// Method Overloading
	public void add(int value1,int value2,int value3) {
		int result = value1 + value2+value3;
		sop(result,"Addition");
	}
	
	public void mul(int value1,int value2) {
		int result = value1 * value2;
		sop(result,"Multiplicaiton");
	}
	
	private void sop(float result,String comingFrom) {
		System.out.println(comingFrom+" "+"Result : "+result);
	}
	
	public int sub(int value1,int value2) {
		int result = value1 - value2;
		return result;
	}
	
	
	
	public void printGst() {
		System.out.println("GST : "+gst); // + indicates Concatination
	}
	
}
