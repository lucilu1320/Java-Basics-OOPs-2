package javaBasics2;
import java.io.*;
class Fibonacci{
	public static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	public static void main(String args[])throws IOException 
	{
		int n;
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.println("Enter The Number for which you want Fibonacci Series: ");
		n = Integer.parseInt(in.readLine());	
		System.out.println("Fibonacci Series: "+fib(n));
	}
	
}