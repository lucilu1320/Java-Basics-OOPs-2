package javaOOPs;

class reptile{
	String name;
	int age;
	static int count;
	//creatingna static variable to call it without making an object
	 reptile() {
		 //similarly we can use this statement below to call the another constructor.
		 //this("random", 22);
		count++;
		//increases count by 1 as many as reptiles are created
		System.out.println("Reptile is created! ");
	}
//	reptile(String newName, int newAge) 
//	
//{
//name = newName;
		//name will be equal to newName
//age = newAge;
		//age will be equal to newAge
		
	//}
	 
	 reptile(String name, int age){
		 
		 //her we are using this keyword to call the whole default constructor above from this constructor
		 //since we are calling this constructor in the main class
		 //the count wont increase 
		 //check once by commenting the below & then uncommenting it. 
		 //this();
		 //we can make use of same name as in class reptile in constructor but 
		 //to access it from reptile class we need to use this keyword on the
		 //current object, here the current object is variable name on the left side.
		 this.name = name;
		 //this keyword is being used to access the name from the reptile class
		 this.age = age;
		 //this keyword is being used to access the age from the reptile class
		 walking(this);
		 //using this here to call this current constructor in the function walking
	 }
	 void walking(reptile obj)
	 //creating object 
	 {
		 System.out.println(name + " is walking: ");
		 age += 10;
		 //increasing age by 10
	 }
	 
	 
}


public class MainClass3 {

	public static void main(String[] args) {
		
		reptile obj1 = new reptile("Frog", 10);
		//passing values 
		System.out.println(obj1.name + " " +obj1.age);
		System.out.println(reptile.count);
		
		
		
	}

}
