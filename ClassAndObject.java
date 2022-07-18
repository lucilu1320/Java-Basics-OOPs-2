package javaOOPs;

class Animal
{
	int legs;
	String name;
	
	void walk() 
	//Method or Function call
	//Using void since we don't want any return except to print!
	{
		System.out.println(name + "is walking! " );
	}
	
	void walk(int steps)
	//Method Overloading: when same name of method/function is called with same name but
	//different parameters it is called method overloading
	{
		System.out.println(name + "Walked " + steps + " steps");
	
	}
	public Animal()
	//Calling Constructor here just to replicate

	{
		System.out.println("Calling the Constructor! ");
		//it will print this two time since two obj are created
	}
	public Animal(String newName) 
	//Constructor Overloading
	{
		System.out.println(newName + " was passsed while creating! ");
	}
}



public class ClassAndObject {
//only one public class can be there in a java program
	public static void main(String[] args) {
		Animal obj1 = new Animal();
		//Object Creation + default Constructor
		Animal obj2 = new Animal("builder");
		//passing value for the constructor overloading
		
		obj1.name = "Simba ";
		obj1.legs = 4;
		obj1.walk();
		obj1.walk(4);
		
		obj2.name = "Bob ";
		obj2.legs = 2;
		obj2.walk();
		obj2.walk(5);
		//Passing a integer value, since it has a parameter of integer type
		
		System.out.println(obj1.name + " " + obj1.legs);
		System.out.println(obj2.name + " " + obj2.legs);
     
	}

}
