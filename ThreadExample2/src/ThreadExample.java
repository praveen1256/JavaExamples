
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		
		
		Thread1 thread1 = new Thread1();
		thread1.setName("My Thread1");
		
		Thread1 thread2 = new Thread1();
		thread2.setName("My Thread2");
		
		Thread1 thread3 = new Thread1();
		thread3.setName("My Thread3");
		
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		thread2.setPriority(Thread.MIN_PRIORITY);
//		thread3.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
		thread3.start();
	}

}
