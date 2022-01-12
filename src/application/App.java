package application;

public class App {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Horace");
		Cat cat2 = new Cat("Matilda");
		
		System.out.println(cat1.toString());
		//System.out.println(cat1.FOOD);
		//Gives an error about accessing the variable in a static way
		
		System.out.println(Cat.FOOD);
		//now it is accessed via the class
		
		System.out.println(cat2.toString());
		
		//another example
		System.out.println(Math.PI);
		//Math is a class in Java, PI is a Math static variable

	}

}
