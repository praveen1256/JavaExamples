import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List Example");
		
		// Generic Class
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
	    list.add("Ravi");//Adding object in arraylist    
	    list.add("Vijay");    
	    list.add("Ravi");    
	    list.add("Ajay");    
	      //Invoking arraylist object   
//	      System.out.println(list); 
//	      System.out.println(list.lastIndexOf("Ravi")); 
//	      System.out.println(list.size());
	      
	      Iterator<String> itr=list.iterator();  

	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      }
	      itr.remove();
	      
	      System.out.println(list); 
//	      System.out.println("For Loop");
//	      for(int i=0;i<list.size();i++) {
//	    	  System.out.println(list.get(i));
//	      }
	      
	      Vector<String> vecList = new Vector<String>();
	      vecList.add("Ravi");//Adding object in arraylist    
	      vecList.add("Vijay");    
	      vecList.add("Ravi");    
	      vecList.add("Ajay");    
	      
	      Enumeration<String> vecIte = vecList.elements();
	      
	      
	}

}
