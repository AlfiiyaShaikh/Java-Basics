//shorter operation of if else
//Q - to check if the number is even or odd

public class ternary {

	public static void main(String[] args) {
		int x=13;
		String result;
       //instead of this
//		if(x % 2==0) {
//			System.out.println("even number");
//		}
//		else {
//			System.out.println("odd number");
//		}
		
		 result = x%2==0 ? "even number" : "odd number";
		 System.out.println(result);
	}

}
