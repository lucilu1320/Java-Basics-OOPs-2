package javaBasics2;
import java.util.Scanner;

public class MaxMinArray
{
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want: ");
        int elements = input.nextInt();

        int [] array = new int[elements];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<elements; i++){

            System.out.print("Enter a number: ");
            array[i] = input.nextInt();

            if(array[i]>max){
                max = array[i];

            }
            if(array[i]<min){
                min = array[i];
            }

        }

        System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);






    }
}