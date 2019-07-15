import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String args[]) {
		ExecutorService executor = Executors.newFixedThreadPool(7);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
        }  
        
        Runnable worker = new WorkerThread("Out");  
        executor.execute(worker);
        

        System.out.println("Ter : "+executor.isTerminated()); 
      executor.shutdown();
        
        while (!executor.isTerminated()) { 

//            System.out.println("While");  
        }  
        System.out.println("Finished all threads");  

        System.out.println("Ter : "+executor.isTerminated());  
    
	}
	
}
