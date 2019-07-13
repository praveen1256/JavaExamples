
public class Thread1 extends MyClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 1 ::::::::: "+i+", Name : "+threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	@Override
	public void logic() {
		// TODO Auto-generated method stub
		super.logic();
	}

}
