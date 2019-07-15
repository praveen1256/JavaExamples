
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		
		
		Thread1 thread1 = new Thread1();
		
		Thread thread = new Thread(thread1);
		thread.setName("My Thread");
		
		
		Thread2 thread2 = new Thread2();
		thread2.setName("My Thread 2");
		
		
		thread.start();
		thread2.start();
		
//		thread.run();
//		thread2.run();
	
		
		
	}

}
