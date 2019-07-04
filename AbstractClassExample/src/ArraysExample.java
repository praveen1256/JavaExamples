
public class ArraysExample {

	public static void main(String[] args) {
		
		int classMarks[] = {10,20,30,40,50};

		String names[] = {"A","B","C","D","E"};
		
		// for(declaration,condition,increment or decrement)
		// declaration one time
		// check condition -> print -> increment ->check condition....
		// Disadvantages : we can't add item later in the array and we can't remove item from array
		
		for(int i=0;i<classMarks.length;i++) {
			System.out.println(classMarks[i]);
		}
		

		for(int i : classMarks) {
			System.out.println("For each "+i);	
		}
		
		
		// Control Statements
		
		//	If,	If-else, switch, while,do-while,for,for-each
		// +,-,*,/,%
		int a = 1;
		
//		System.out.println(a%2);
		// If
		if(a%2==0) {
			System.out.println("Even");
			if(a>10) {
				System.out.println("Above 10");	
			} else {
				System.out.println("Below 10");
			}
		} else {
			System.out.println("Odd");
		}
		
		
		switch (a) {
		case 1:
			System.out.println("Case 1");
		case 2:
			System.out.println("Case 2");
			break;
		case 14:
			System.out.println("Case 14");
			break;
		default:
			System.out.println("Case Default");
			break;
		}
		
		int i=0;
		while (i<=10) {
			System.out.println("While "+i);
			i++;
		}
		
		i = 0;
		do {
			System.out.println("Do While "+i);
			i++;
		}while(i<10);
		
		i=0;
		// break will break the loop
		// continue will skip the loop
		for(i=0;i<=2;i++) {
			System.out.println("For I Loop "+i);
			for(int j=0;j<=2;j++) {
				System.out.println("For J Loop "+j);
				if(j==1)
					continue;
				System.out.println("For J After Break");
				
			}
		}
		
		
	}
	
}
