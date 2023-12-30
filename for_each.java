import java.util.*;
public class for_each {
    public static void main(String[] args) {
    	
    	//use to iterate over array/collection ; less steps ;more readable
    	
    	//for array
    	//String[] animals= {"cat","dogs","hippo"};
    	
    	//for arraylist
    	ArrayList<String> animals=new ArrayList<String>();
    	animals.add("cat");
    	animals.add("dog");
    	animals.add("hippo");
    	
    	for (String i : animals) {
    		System.out.println(i);
    	}
    }
}
