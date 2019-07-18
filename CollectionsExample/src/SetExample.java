import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
//		treeSet.add(null);
		treeSet.add("Kumar");
		treeSet.add("Ajay");
		treeSet.add("Arun");
		treeSet.add("Varun");
		treeSet.add("Kumar");
		
		System.out.println(treeSet);
		
		HashSet<String> hashSet = new HashSet();
		hashSet.add(null);
		hashSet.add("Ajay");
		hashSet.add("Kumar");
		hashSet.add("Arun");
		hashSet.add("Varun");
		hashSet.add("Kumar");
		
		System.out.println(hashSet);
		
		String retStr = treeSet.higher("Arun");
		System.out.println(retStr);
		
	}

}
