
public class Product {
	
	private String productName;

	private String productName2;
	
	private int cost;
	
	public int gst;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		this.productName = "p:"+productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
