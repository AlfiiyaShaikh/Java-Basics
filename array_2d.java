
public class array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way
       String[][] names=new String[3][3];
       names[0][0]="names";
       names[0][1]="div";
       names[0][2]="sub";
       names[1][0]="alfiya";
       names[1][1]="A";
       names[1][2]="eng";
       names[2][0]="sumaiya";
       names[2][1]="B";
       names[2][2]="hindi";
//       for (int i=0;i<names.length;i++) {
//    	   System.out.println();
//    	   for(int j=0;j<names.length;j++) {
//    		  System.out.print(names[i][j]+" ");
//    	   }
//       }
       
      //2nd way
       String[][] names1 ={
    		   {"names","div" ,"sub"},
    		   {"alfiya","A","eng"},
    		   {"sumaiya","B","hindi"}
    		   };
       for (int i=0;i<names1.length;i++) {
    	   System.out.println();
    	   for(int j=0;j<names1.length;j++) {
    		  System.out.print(names1[i][j]+" ");
    	   }
       }
	}
	

}
