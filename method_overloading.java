
public class method_overloading {

	//same method name but different parameters
	public static void main(String[] args) {
		
		System.out.println(add(1,3));
		System.out.println(add(1,3,4));
		System.out.println(add(1.2,3.4));
	}
	
	static int add(int a,int b) {
		System.out.println("this is method overloading #1");
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		System.out.println("this is method overloading #2");
		return a+b+c;
	}
	
	static double add(double a,double b) {
		System.out.println("this is method overloading #3");
		return a+b;
	}

}
