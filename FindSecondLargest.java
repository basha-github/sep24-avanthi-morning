
public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] num = {100,23,45,89,1,2,3,4};
		
		int sec=0,high=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i] > high) {
				sec = high;
				high = num[i];
			}//if
			else if(num[i]> sec) {
				sec = num[i];
			}//else
		}//for
		
		System.out.println("Second largest--->"+sec);
	}

}
