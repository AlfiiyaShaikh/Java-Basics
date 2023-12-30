//importing scanner object\
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		    //object of scanner
		    Scanner input = new Scanner(System.in); 
			System.out.println("What is your name ?");
			String name=input.nextLine();     //using scanner to take input
			
			System.out.println("What is your age ?");
			int age=input.nextInt();
			
			//when scanner called for int after entering it takes \n as string in scanner line
			input.nextLine();  //to store \n  
			
			System.out.println("What is your favourite food ?");
			String food=input.nextLine();
			
			System.out.println("Your name is "+name);
			System.out.println("Your age is "+age);
			System.out.println("Your favourite food is "+food);
		
		input.close();
		
		
		

	}

}
