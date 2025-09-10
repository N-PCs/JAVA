// (Accessing an invalid index in an array) 

public class ArrayIndexExample { 
    public static void main(String[] args) { 
        try { 
            int[] arr = {1, 2, 3}; 
            System.out.println(arr[5]);  // Index out of range 
        }  
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: ArrayIndexOutOfBoundsException "); 
        } 
    } 
} 