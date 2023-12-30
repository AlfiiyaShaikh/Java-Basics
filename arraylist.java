import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		//uses reference dt ie wrapper class, resizable array ;elements can be remove add and set
		
		ArrayList<String> food=new ArrayList<String>();
		food.add("biryani");
		food.add("samosa");
		food.add("pani puri");
		
		food.set(2, "ragda");
		food.remove(2);
//		food.clear();
		
		for (int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		
	}

}
