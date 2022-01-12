package application;

public class App {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Horace");
		Cat cat2 = new Cat("Matilda");
		Cat cat3 = new Cat("Peter");
		
		System.out.println(cat1.toString());
		//System.out.println(cat1.FOOD);
		//Gives an error about accessing the variable in a static way
		
		System.out.println(Cat.FOOD);
		//now it is accessed via the class
		
		System.out.println(cat2.toString());
		
		//This is a method associated with an object,
		//but it's calling a class variable
		//System.out.println(cat1.getCount());
		
		//This is a class method calling the class variable
		System.out.println(Cat.getCount());
		
		//another example
		System.out.println(Math.PI);
		//Math is a class in Java, PI is a Math static variable

	}

}
