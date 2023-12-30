//A function is a block of code that performs a specific task. 
//The return type of a function is the data type of the variable that that function  returns.  
//When a function does not return any value, in that case the return type of the  function is ‘void’. 

public class functions {
	public static void isPrime(int n) {
    	if(!(n%2==0)) {
    		System.out.println("the number is prime number");
    	}
    	else {
    		System.out.println("even number");
    	}
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=11;
        isPrime(n);
	}

}
