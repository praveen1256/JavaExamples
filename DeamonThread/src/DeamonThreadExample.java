
public class DeamonThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDaemonThread1 t1=new TestDaemonThread1();//creating thread
		TestDaemonThread1 t2=new TestDaemonThread1();
		TestDaemonThread1 t3=new TestDaemonThread1();
		
		t1.setDaemon(true);//now t1 is daemon thread
		t1.start();//starting threads
		t2.start();
		t3.start();

	}

}
