import java.util.Scanner;
public class do_while {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String name="";
		
		//similar to while loop--do while first perform the task and check the condition --runs atleast one time
		do {
			System.out.println("enter your name please");
			name=input.nextLine();
		}
		while(name.isBlank());
		
		System.out.println("hello "+name);
        input.close();
	}

}
