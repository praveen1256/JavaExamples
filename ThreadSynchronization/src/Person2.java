
public class Person2 extends Thread {
	Table t;

	Person2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
