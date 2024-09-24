
public class FindNoIndivDigits {

	public static void main(String[] args) {
		long num = 231003433997856l,r;
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c0=0;
		while(num != 0) {
			r = num % 10;
			if(r== 0) c0=0;
			else if(r== 1) c1=0;
			else if(r== 2) c2=0;
			else if(r== 3) c3=0;
			else if(r== 4) c4=0;
			else if(r== 5) c5=0;
			else if(r== 6) c6=0;
			else if(r== 7) c7=0;
			else if(r== 8) c8=0;
			else if(r== 9) c9=0;
			num = num / 10;
		}// while
		System.out.println("c0---->"+c0);
		System.out.println("c1---->"+c1);
		System.out.println("c2---->"+c2);
		System.out.println("c3---->"+c3);
		System.out.println("c4---->"+c4);
		System.out.println("c5---->"+c5);
		System.out.println("c6---->"+c6);
		System.out.println("c7---->"+c7);
		System.out.println("c8---->"+c8);
		System.out.println("c9---->"+c9);
	}

}
