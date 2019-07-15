
public class Chat {
	boolean flag = false;

	public synchronized void Question(String msg) {
		if (flag) {
			try {
				System.out.println("Question Before Waiting");
				wait();
				System.out.println("Question After Waiting");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Question : "+msg);
		flag = true;

		System.out.println("Question Before Notify");
		notify();

		System.out.println("Question After Notify");
	}

	public synchronized void Answer(String msg) {
		if (!flag) {
			try {
				System.out.println("Answer Before Waiting");
				wait();
				System.out.println("Answer Before Waiting");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Answer : "+msg);
		flag = false;
		System.out.println("Answer Before Notify");
		notify();
		System.out.println("Answer After Notify");
	}

}
