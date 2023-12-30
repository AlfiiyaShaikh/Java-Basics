
public class switch_case {
	
     public static void main(String[]args) {
    	 
    	 String fruit="banana";
    	 
//    	 its imp to add break after ease case to terminate another case after it
    	 switch(fruit) {
    	     case ("mango"): 
    	    	   System.out.println("it's mango");
    	           break;
    	     case ("apple"): 
    	    	   System.out.println("it's apple");
    	           break;
    	     case ("chickoo"): 
    	    	   System.out.println("it's chickoo");
    	           break;
    	      default:
    	    	   System.out.println("its another fruit or not a fruit");  //for printing if case is not equal to any of it
    	 }
     }
}
