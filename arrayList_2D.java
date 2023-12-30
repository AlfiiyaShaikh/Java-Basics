import java.util.*;
public class arrayList_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<ArrayList<String>> groceryList=new ArrayList<ArrayList<String>>();
	ArrayList<String> producelist=new ArrayList<String>();
     producelist.add("apples");
     producelist.add("milk");
     producelist.add("tomatoes");
     
     ArrayList<String> drinklist=new ArrayList<String>();
     drinklist.add("soda");
     drinklist.add("pepsi");
     
     ArrayList<String> bakerylist=new ArrayList<String>();
     bakerylist.add("bread");
     bakerylist.add("butter");
     
     groceryList.add(producelist);
     groceryList.add(drinklist);
     groceryList.add(bakerylist);
     
     System.out.println(groceryList);  // output : [[apples, milk, tomatoes], [soda, pepsi], [bread, butter]]
     
//     System.out.println(groceryList.get(0));    //output : [apples, milk, tomatoes]
//     System.out.println(groceryList.get(0).get(0));  //output : apples
	}

}
