package javaOOPs;

public class LearnInheritance {

	public static void main(String[] args) {
		//creating object of samsung class
		Samsung s22 = new Samsung();
		//calling function playGames from Samsung Object i.e s22
		s22.playGames();
		//Creating Apple object
		Apple a1 = new Apple();
		//here the  apple class doesent have a function playGames so when we call 
		//the function which isnt present in the class it goes to check on its parent class
		//if function found it returns the output if not present it gives error
		a1.playGames();
		
	}

}
class Samsung extends MobilePhone
//extends keyword is used to call the parent class stuffs like price dimension, etc.
//since price dimensions os these are common between the two cub classes i.e Samsung & Apple

{
	void playGames()
	{
		System.out.println("Samsung Plays! ");
	}
	
}
class Apple extends MobilePhone
{
	
}
class MobilePhone
{
	int price;
	boolean hasHeadphoneJack;
	int dimensions;
	String os;
	void playGames()
	{
		System.out.println("Mobile Phone Plays! ");
	}
}