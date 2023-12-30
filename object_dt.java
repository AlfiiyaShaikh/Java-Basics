//object dt is User-defined data types  aka reference or non rimitive ex. array,strings,classes,interfaces
import java.util.Arrays;

public class object_dt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


         int[] c= {10,20,30,40};
         int[] d=c;
         
         System.out.println("Initially");
         System.out.println("c is : "+ Arrays.toString(c));
         System.out.println("d is : "+ Arrays.toString(d));
         
         d[1]=50;
         System.out.println("after changing index 1 : 50 of d : ");
         System.out.println(Arrays.toString(c));
         System.out.println( Arrays.toString(d));
         
        /* When the reference variables will be stored, 
           the variable will be stored in the stack and the original object will be stored in the heap. 
           In Object data type although two copies will be created 
           they both will point to the same variable in the heap, 
           hence changes made to any variable will reflect the change in both the variables.*/
	}

}
