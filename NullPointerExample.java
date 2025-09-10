// (Accessing method or variable on null object) 

public class NullPointerExample { 
    public static void main(String[] args) { 
        try { 
            String s = null; 
            System.out.println(s.length());
        }  
        catch (NullPointerException e) { 
            System.out.println("Error: NullPointerException"); 
        }
        finally{
            System.out.println("Program completed! ");
        }
    } 
} 