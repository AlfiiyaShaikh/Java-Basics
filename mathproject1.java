//get the hypotenuse of a trianle
//formula hypo=sqrt(x*x +y*y)

import java.util.Scanner;
public class mathproject1 {

	public static void main(String[] args) {
		double x;
		double y;
		double hypo;
		
		//take input of x and y
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side x");
		x=sc.nextDouble();
		
		System.out.println("enter side y");
		y=sc.nextDouble();
		
		//result
		hypo=Math.sqrt((x*x)+(y*y));
		System.out.println("Hypotenuse of a triangle having side x : "+x +" and y : "+y+ " is : " + hypo);
        
		sc.close();
	}

}
