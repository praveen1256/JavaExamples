
public class ThreadSyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();//only one object  
		
		Person1 p1=new Person1(obj);  
		Person2 p2=new Person2(obj);  
		
		p1.start();  
		p2.start();  

	}

}
