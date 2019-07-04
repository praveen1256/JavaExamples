
public class ImpBusiness2 implements Business2 , Business3{

	@Override
	public void business1() {
		// TODO Auto-generated method stub
		System.out.println("Interface Business 1");
	}

	@Override
	public void business2() {
		// TODO Auto-generated method stub
		System.out.println("Interface Business 2");
	}

	@Override
	public void business3() {
		// TODO Auto-generated method stub
		System.out.println("Interface Business 3");
	}

	@Override
	public void business4() {
		// TODO Auto-generated method stub
		System.out.println("Interface Business 4");
	}
	
	@Override
	public void businessCalculation(Clac calc,Clac.Operations operations) {
		calc.add(10, 20);
	}

}
