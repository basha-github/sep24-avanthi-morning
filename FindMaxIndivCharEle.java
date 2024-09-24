
public class FindMaxIndivCharEle {

	public static void main(String[] args) {
	
		String str  = "Hello How are you Welcome to java";
		str = str.toUpperCase();
		// A--Z
		// 65---90
		int[] c = {0,0,0,0,0,
				   0,0,0,0,0,
				   0,0,0,0,0,
				   0,0,0,0,0,
				   0,0,0,0,0,
				   0
				   };
		
		char ch =' ';
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			if( (ch >=65) && (ch <=90)) {
				// 90-65---25
				int index = ch-65;
				c[index]++;
			}
			
		}
		
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+65)+"--->"+c[i]);
		}
		
		
	}

}
