
public class Pet {

	private String name;
	private int age;
	private String location;
	private String type = "Manx";
	
	public Pet() {
		
	}
	
	public Pet(String name, int age, String location, String type) {
		
	}
	
	public String getName() {
		return "This pet's name is "+name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getType() {
		return name+" is a "+type+".";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public static void main(String[] args) {

		Pet baal = new Pet();
		
		baal.setName("Baal");
		System.out.println(baal.getName());
		
		System.out.println(baal.getType());
		
		baal.setAge(6);
		System.out.println(baal.name+" is "+baal.age+" years old.");
		baal.setLocation("underfoot");
		System.out.println("If you can't see them, "+baal.name+" is almost certainly "+baal.location+".");
		
		
		
		
		
		
	}

}
