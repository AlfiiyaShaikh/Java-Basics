
public class operator {

	public static void main(String[] args) {
		
		// Arithmetic operators
        int a = 10;
        int b = 3;
        System.out.println("Arithmetic operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
     // Interger declared
        int a1 = 10;
        int b1= 10;
 
        // Using uniary operators ---Unary operators need only one operand.
        System.out.println(" Using uniary operators");
        //System.out.println("Postincrement : " + (a1++));  // 1st stores then increment
        System.out.println("Preincrement : " + (++a1));      //1st increment then stores    
 
       // System.out.println("Postdecrement : " + (b1--));   // 1st stores then decrement  
        System.out.println("Predecrement : " + (--b1));      //1st decrement then stores 
        
        //using assignment operator 
        System.out.println("using assignment operator ");
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        
        //Relational Operators-- These operators are used to check for relations 
        //like equality, greater than, and less than. They return boolean results 
        System.out.println("Relational Operators");
        int a2 = 10;
        int b2= 3;
        int c2 = 5;
 
        System.out.println("a2 > b2: " + (a2 > b2));
        System.out.println("a2 < b2: " + (a2 < b2));
        System.out.println("a2 >= b2: " + (a2 >= b2));
        System.out.println("a2 <= b2: " + (a2 <= b2));
        System.out.println("a2 == c2: " + (a2 == c2));
        System.out.println("a2 != c2: " + (a2 != c2));
        
        //Logical Operators-- the second condition is not evaluated if the first one is false,
        System.out.println("Logical Operators");
        boolean x = true;
        boolean y = false;
       
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
	}

}
