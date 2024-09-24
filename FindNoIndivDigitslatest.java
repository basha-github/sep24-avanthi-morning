
public class FindNoIndivDigitslatest {

	public static void main(String[] args) {
		
		long num = 231003433997856l;
		int r;
		int[] c = {0,0,0,0,0,
				   0,0,0,0,0
				   };
		
		while(num != 0) {
			r = (int)(num % 10);// 6
			c[r]++;// c[6]++
			num = num/10;
		}
		for(int i=0;i<10;i++) {
			System.out.println("c["+i+"]---->"+c[i]);
			
		}

	}

}
