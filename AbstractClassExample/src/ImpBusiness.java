
public class ImpBusiness extends Business{
	
	public ImpBusiness() {
		// TODO Auto-generated constructor stub
		System.out.println("ImpBusiness Constructor");
	}

	public ImpBusiness(String value) {
		// TODO Auto-generated constructor stub
		super(value);
		System.out.println("ImpBusiness Constructor Param 1");
	}
	
	@Override
	public void business3() {
		// TODO Auto-generated method stub
		System.out.println("Business 3");
	}
	
	

}
