
public class Person1 extends Thread {
	Table t;
	boolean value;

	Person1(Table t,boolean value) {
		this.t = t;
		this.value = value;
	}

	public void run() {
		t.printTable(5,value);
	}
}

