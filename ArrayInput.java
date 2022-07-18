package javaBasics2;
import java.util.*;
public class ArrayInput {

	public static void main(String[] args) {
		int[] age = new int[5];
		//Declaration of array
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Age's: ");
		for(int i = 0; i<5; i++) 
			//To take input 5 times
		
		{
			
			age[i] = in.nextInt();
		//Here i is index, therefore as the index increases(till 5 as array size specified)
			//input goes on with increase of index
		}
		for(int i = 0; i<5; i++)
		//To print the value of age 5 times
		{
			System.out.println("The age's of " + (i+1) + " are: " +age[i]);
			//(i+1) so that the index starts from 1
		}
	}

}
