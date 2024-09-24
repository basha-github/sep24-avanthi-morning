
class A{
	
	
	void add(float a,float b) {
		System.out.println("from 2");
		
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println("from 3");
		System.out.println(a+b+c);
	}
	void add(String firstName,String lastName) {
		System.out.println(firstName+" "+lastName);
	}
}



public class OverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A objA = new A();
		
		objA.add(100, 200);
		
	}

}

