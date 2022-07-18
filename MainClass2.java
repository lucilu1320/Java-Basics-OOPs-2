package javaOOPs;

class person
{
	String name;
	int age;
	static int count;
	public person()
	//Decalaring Constructor
	{
		System.out.println();
		count++;
		//Whenever a person is created its count will increase by 1
		System.out.println();
		System.out.println(" Person is being created! ");
		//it will print that much time as much as persons are created
		
	}
	person(String newName, int newAge){
		name = newName;
		age = newAge;
	}
}
public class MainClass2
{

	public static void main(String[] args) {
		
		person obj1 = new person();
		//creating object
		//whenever we create an object constructor is called
		person obj2 = new person();
		//creating object
		obj1.name = "Sahil";
		obj1.age = 22;
		obj2.name = "Saloni";
		obj2.age = 23;
		System.out.println(person.count);
		System.out.println("Name: " + obj1.name + "\nAge: " + obj1.age);
		System.out.println();
		System.out.println("Name: " + obj2.name + "\nAge: " + obj2.age);


	}

}
