//nested for loop

import java.util.Scanner;
public class for_loop_ass1 {

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         
         System.out.println("enter symbol");  //ek ke baad ek
         String symbol=sc.next();
         
         
         System.out.println("enter rows");  //ek ke niche ek
         int rows=sc.nextInt();
         
         System.out.println("enter colums");  //ek ke baad ek
         int colums=sc.nextInt();
         
         
         for(int i=1;i<=rows;i++) {
        	 System.out.println();
        	 for(int j=1;j<=colums;j++) {
        		System.out.print(symbol); 
        	 }
         }
         
		sc.close();
         
	}

}
