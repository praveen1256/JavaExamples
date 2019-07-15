
public class Thread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		String threadName = Thread.currentThread().getName();
//		System.out.println(threadName);
		for(int i=1;i<=5;i++) {
			System.out.println(i+", Name : "+threadName);
			try {
				Thread.sleep(1000);
//				System.out.println("After Sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
