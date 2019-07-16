
public class Person1 extends Thread {
	Table t;

	Person1(Table t) {
		this.t = t;
	}

	public void run() {
		t.calculate(5);
	}
}

