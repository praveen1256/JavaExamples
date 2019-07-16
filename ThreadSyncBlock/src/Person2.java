
public class Person2 extends Thread {
	Table t;
	boolean value;

	Person2(Table t,boolean value) {
		this.t = t;
		this.value = value;
	}

	public void run() {
		t.printTable(100,value);
	}
}
