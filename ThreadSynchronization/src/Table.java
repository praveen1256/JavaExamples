
public class Table {
	int sum = 0;
	
	
	synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	// Thread Safe : For Multi Threads we can suggest this
	synchronized void calculate(int amount) {// method not synchronized
		System.out.println("calculate Inside");
		for (int i = 1; i <= 5; i++) {
			sum += amount;
			System.out.println("Amount : "+sum);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		sum =0;
	}
	
	// Not Thread Safe : Only Single we can suggest this
	void bookTicket(int seatNo) {
		// Logic to book ticket
		
	}
	

}
