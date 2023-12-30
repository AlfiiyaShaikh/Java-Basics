
public class swapping {

	public static void main(String[] args) {
		String a=" \"red\" ";
		String b=" \"yellow\" ";
		
		//initially a and b are
		System.out.println("before swapping");
		System.out.println("a is :"+a+"\nb is : "+b+"\n");
		
		//swapping
		String temp;
		temp=a;
		a=b;
		b=temp;
		
		//after swapping
		System.out.println("after swapping");
		System.out.println("a is :"+a+"\nb is : "+b);
		
		
	}

}
