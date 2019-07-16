
public class Person2 extends Thread {
	Table t;

	Person2(Table t) {
		this.t = t;
	}

	public void run() {
		t.calculate(100);
	}
}
