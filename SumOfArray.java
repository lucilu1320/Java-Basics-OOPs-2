package javaBasics2;

import java.util.Scanner;

public class SumOfArray {
		public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
			 
		        System.out.println("Enter array size: ");
		        int size = s.nextInt();
		        // create an array
		        int[] array = new int[size];
		 
		        // reading values from user keyboard
		        System.out.println("Enter array values :  ");
		        for (int i = 0; i < size; i++) {
		            int value = s.nextInt();
		            array[i] = value;
		 
		        }
		 
		        // getting array length
		        int length = array.length;
		 
		        // default sum value.
		        int sum = 0;
		 
		        // sum of all values in array using for loop
		        for (int i = 0; i < array.length; i++) {
		            sum += array[i];
		        
		 
		        }
		        System.out.println("Sum : " + sum);
		        }
		    }
		

	
