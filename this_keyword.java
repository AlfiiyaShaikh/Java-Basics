
public class this_keyword {
	
	
	String name="jerry";
	
	

	
	public String get_name() {
		return name;
		
		
	}
	
	public void change_name(String name2) {
		
		this.name=name2;
		System.out.println("changed name is : "+name2);
	}

	public static void main(String[] args) {
		this_keyword obj=new this_keyword();
		
		System.out.println(obj.get_name());
		obj.change_name("meenu");
		

	}

}
