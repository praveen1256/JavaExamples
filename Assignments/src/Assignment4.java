
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArray[] = {100,50,20,20,10,4,6,3,4,5,2,4,8,68,105};
		int minNum = 0;
		int maxNum = 0;
		
		for(int i=0;i<numArray.length;i++) {
			if(i==0) {
				minNum=numArray[i];
				maxNum=numArray[i];
			}
			if(numArray[i]<minNum)
				minNum=numArray[i];
			if(numArray[i]>maxNum)
				maxNum=numArray[i];
		}
		
		int diff = maxNum-minNum;
		System.out.println("Max Num : "+maxNum+"\nMin Num : "+minNum+"\nDiff : "+diff);
		
	}

}
