package javaBasics2;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fact = 1;
		int number;
		System.out.println("Enter the Number you want factorial for: ");
		number = in.nextInt();
		for(int i = 1; i <= number; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " + number + " is: " +fact );

	}

}
