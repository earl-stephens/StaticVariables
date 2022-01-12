package application;

public class Cat {
	private String name;
	public final static String FOOD = "Cat food";
	//static means this is now a class variable
	//it's associated with the class, not objects of the class
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Cat [name= " + name + "]";
	}
}
