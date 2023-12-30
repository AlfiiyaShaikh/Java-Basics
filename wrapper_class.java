import java.util.ArrayList;

public class wrapper_class {
	
//Wrapper classes are used to wrap primitive data types in an object, 
//	allowing them to be treated as objects in Java.
	
	
	
/*
 primitive --  wrapper
 
  int      -- Integer
  double   -- Double
  char     -- Character
  boolean  -- Boolean
  
  
 Here are a few more details about wrapper classes:
 
 1. Autoboxing and Unboxing: Java provides automatic 
	conversion between primitive types and their corresponding wrapper classes.
	
	autoboxing : primitive to wrapper class  ex : int to Integer
	unboxing : wrapper class to primitive   ex : Integer to int
*/

	public static void main(String[]args) {
		
        //ex of wrapper class --- ArrayList which stores only objects
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(24);
		System.out.println(arraylist.get(0));
		
	//Autoboxing 
	//ex 1
		
	int num1= 10;
	Integer obj1=num1;
	System.out.println(obj1);
	
	
	//Unboxing ex
	
	Integer obj2=10;
	int num2=obj2;
	System.out.println(num2);
	
	//ex -2
	
	ArrayList<Integer> arraylist1=new ArrayList<Integer>();
	arraylist1.add(24);
	int result=arraylist1.get(0);    //to get an object it should be of premitive dt
	System.out.println(result);
	}
}
