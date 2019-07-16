
public class DeadLockExample {

	public static Object obj1 = new Object();// Caluate Final Aamount
	public static Object obj2 = new Object();// Final Amount GST

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();

	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (obj1) {
				System.out.println("Thread 1: Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (obj2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
			System.out.println("Thread 1: Released Object 1 & 2...");
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (obj1) {
				System.out.println("Thread 2: Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (obj2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
			System.out.println("Thread 2: Released Object 1 & 2...");
		}
	}

}
