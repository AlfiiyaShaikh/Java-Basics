//1. import random
import java.util.Random;
public class random_number {

	public static void main(String[] args) {

        //2. create instance of randow
		Random random=new Random();
		//int x=random.nextInt();     //can give 2 random number between 2 billion to -2 billion
		//can also limit it 
//		int x=random.nextInt(5); //generate between 0to 4
		int x=random.nextInt(5)+1;   //generate till 5
		
//		double x=random.nextDouble();   //give random value between 0 and 1
		
//		boolean x=random.nextBoolean();

//		string x=random.next();  //give error
		
		System.out.println(x);
		
		
	}

	

}
