
public class Table {

	void printTable(int n,boolean value) {// method not synchronized
		System.out.println("Before Sync Block");
		
		if(value) {
			// some logic
			synchronized (this) {
				for (int i = 1; i <= 5; i++) {
					System.out.println(n * i);
					try {
						Thread.sleep(400);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		} else {
			// some logic
		}
		
		
		System.out.println("After Sync Block");
	}

}
