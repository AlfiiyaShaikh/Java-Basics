//project -- take a user input and check if the 
import java.util.Scanner;
public class if_else_project {

	public static void main(String[] args) {
		
		//insatcnce of scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name ");
		String name=sc.next();
		System.out.println(name);
		
		//in java to compare string we use "equals" not "=="
		if(name.equals("alfiya")) {
	    	   System.out.println("hello alfiya");
	       }
	       
//	       can write multiple else if condition
	    else if(name.equals("sumaiya")){
	    	   System.out.println("hello sumaiya");
	       }
	       
	    else {
	    	   System.out.println("hey there");
	       }
		
          sc.close();
	}

}
