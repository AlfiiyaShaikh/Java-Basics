
public class array_1d {

	public static void main(String[] args) {
		
		//1st way to define an array
		
		String[] names= {"alfiya","sumaiya","halima"};
//		System.out.println(names[0]);  //before altering
		
//		names[0]="zeba";
//		System.out.println(names[0]);
		
		//for displaying array
		System.out.println("length of an array names is : "+names.length);
		System.out.println("elements in names are : ");
		for(int i=0;i<=names.length-1;i++) {
			System.out.println("element at "+i+" is "+names[i]);
			
			
//	    2nd way to define an array
			String[] cars=new String[3];
			cars[0]="toyoto";
			cars[1]="nano";
			cars[2]="honda";
			
			System.out.println(cars[0]);
		    for (int i1=0;i1 < cars.length; i1++) {
		    	System.out.println(cars[i1]);
		    }
		}
        
	}

}
