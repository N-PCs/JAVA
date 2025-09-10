// (Accessing an invalid index in a string) 

public class StringIndexExample { 
    public static void main(String[] args) { 
        try { 
            String word = "Java"; 
            System.out.println(word.charAt(10));  // Invalid index 
        }  
        catch (StringIndexOutOfBoundsException e) { 
            System.out.println("Error: StringIndexOutOfBoundsException"); 
        } 
    } 
} 