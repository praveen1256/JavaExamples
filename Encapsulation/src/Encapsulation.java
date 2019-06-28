
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapExample encapExample = new EncapExample();
		encapExample.setTax(30);
		int tax = encapExample.getTax();
		System.out.println(tax);
		
		Product product = new Product();
		product.setProductName("Pen");
		
		
		
	}

}
