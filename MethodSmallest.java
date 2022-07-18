package javaBasics2;
import java.io.*;
class MethodSmallest
{
	public static int Smallest(int Number_1, int Number_2, int Number_3)
{
	if(Number_1 < Number_2 && Number_1 < Number_2) {
	System.out.println("Smallest Number is Number_1: " +Number_1);
	return Number_1;
	}
	else if(Number_2 < Number_1 && Number_2 < Number_3) {
		System.out.println("Smallest Number is Number_2: " +Number_2 );
		return Number_2;
	}
	else {
		System.out.println("Smallest Number is Number_3: " +Number_3);
		return Number_3;
	}
}
public static void main(String args[])throws IOException
{
	int a,b,c,d;
	InputStreamReader read = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(read);
	System.out.println("Enter Three Numbers to check: ");
	a = Integer.parseInt(in.readLine());
	b = Integer.parseInt(in.readLine());
	c = Integer.parseInt(in.readLine());
	d = Smallest(a,b,c);
}
}