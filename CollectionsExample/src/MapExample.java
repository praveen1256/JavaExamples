import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Kumar";
		System.out.println(name);
		System.out.println(name.hashCode());
		name = "M Kumar";
		System.out.println(name);
		System.out.println(name.hashCode());
		
		StringBuffer stringBuffer = new StringBuffer("Kumar");
		System.out.println(stringBuffer.toString());
		System.out.println(stringBuffer.hashCode());
		stringBuffer.append(" M");
		System.out.println(stringBuffer.toString());
		System.out.println(stringBuffer.hashCode());
		
		Integer j = new Integer(20);
//		int i = 10;
		
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		Hashtable<Integer, String> hashMap2 = new Hashtable<Integer, String>();
		
		hashMap.put(1, "Kumar1");
		hashMap.put(2, "Kumar2");
		hashMap.put(3, "Kumar3");
		hashMap.put(4, "Kumar4");
		hashMap.put(5, "Kumar5");
		
		Collection<String> collection = hashMap.values();
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		String value = hashMap.get(1);
		System.out.println(value);
		
		HashMap<Integer, Student> hashMap3 = new HashMap<Integer, Student>();
		Student student = new Student();
		student.setStudentName("A");
		Student student2 = new Student();
		student2.setStudentName("B");
		Student student3 = new Student();
		student3.setStudentName("C");
		
		hashMap3.put(1, student);
		hashMap3.put(2, student2);
		hashMap3.put(3, student3);
		
		Student stu = hashMap3.get(2);
		System.out.println(stu.getStudentName());
		
		College college1 = new College();
		college1.setCollegeName("College1");
		
		College college2 = new College();
		college1.setCollegeName("College2");
		
		
		HashMap<College, Student> hashMap4 = new HashMap<College, Student>();
		hashMap4.put(college1, student);
		hashMap4.put(college1, student2);
		hashMap4.put(college2, student3);
		System.out.println("****************************");
		
		Set<College> colleges = hashMap4.keySet();
		Iterator<College> iterator2 = colleges.iterator();
		while (iterator2.hasNext()) {
			College college = (College) iterator2.next();
			Student student4 = hashMap4.get(college);	
			System.out.println(student4.getStudentName());
		}
//		for(int i=0;i<hashMap4.size();i++) {
//			Student student4 = hashMap4.get(i);
//			System.out.println(student4.getStudentName());
//		}
			
		
	}

}
