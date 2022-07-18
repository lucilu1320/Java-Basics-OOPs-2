package javaBasics2;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the Number: ");
int number = in.nextInt();
for(int i=1; i<=10; i++) {
	int multiplication = number *i;
	System.out.println("The Multiplication Table for: "+ number + " x " + i + " = " +multiplication);
}
	}

}
