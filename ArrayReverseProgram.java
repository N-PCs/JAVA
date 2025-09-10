/*  Write a program in java to declare array(integer type) to take /insert ten elements print 
    the same inserted element on the screen also print the array elements in reverse order */

import java.util.Scanner;

public class ArrayReverseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                       // for input
        
        System.out.print("Enter number of elements to be added: ");   // for size of array 
        int num = scanner.nextInt();
        
        int[] numbers = new int[num];
        
        System.out.println("Enter " + num + " integer elements:");
        for (int i = 0; i < num; i++) {                                 // to take input in order
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nInserted elements in original order:"); // to print in order
        for (int i = 0; i < num; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nArray elements in reverse order:");     // to print in reverse order
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        scanner.close();
    }
}