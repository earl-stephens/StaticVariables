package application;

public class Cat {
	private String name;
	private int catID = 0;
	public final static String FOOD = "Cat food";
	//static means this is now a class variable
	//it's associated with the class, not objects of the class
	
	//count is initialized when the class first loads
	private static int count = 0;
	
	public Cat(String name) {
		this.name = name;
		catID = count;
		//count is incremented every time a Cat object is made
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String toString() {
		return "Cat name = " + name + " and ID = " + catID;
	}
}
