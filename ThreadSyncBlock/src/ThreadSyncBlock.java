
public class ThreadSyncBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Table obj = new Table();// only one object
		Person1 t1 = new Person1(obj,true);
		Person2 t2 = new Person2(obj,false);
		t1.start();
		t2.start();
	}

}
