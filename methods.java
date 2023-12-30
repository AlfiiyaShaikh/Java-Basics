import java.util.*;
public class methods {
	
	//behaviour of a class , it is only excecutable when it is called

	public static void main(String[] args) {
		
		//ex1
//		hello("alfiya");
		
		System.out.println("enter your name");
		Scanner obj =new Scanner(System.in);
		String name=obj.next();
		obj.close();
		
        hello(name);
        
        //ex 2
        int x=10;
        int y=11;
        System.out.println(add(x,y)); 

        //ex 2.1
        System.out.println(name1());
        }
	
	
	
	//ex 1 of void
	static void hello(String name){
		System.out.println("hello "+name);
	}
	
	//ex2 of int--return type (every primitive n reference is the the return type)
	static int add(int x,int y) {
		int z = x + y;
		return z;
	}
	
	//ex 2.1
	static String name1() {
		String a="alfiyaaa";
		return a;
	}

}
