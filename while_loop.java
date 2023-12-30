import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name="";
		
		//is.Blank checks if the string is blank or not
		while (name.isBlank()) {
			
			//takes input utill the name is blank
			System.out.println("enter your name");
			
			//store it in name
			name=sc.nextLine();
		}
		System.out.println("hello "+name);		
        sc.close();
	}

}
