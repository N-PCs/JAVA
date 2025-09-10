// specific case of io exception

import java.io.*; 
public class FileNotFoundExample { 
    public static void main(String[] args) { 
        try { 
        FileInputStream f = new FileInputStream("data.txt"); 
        }  
        catch (FileNotFoundException e) { 
            System.out.println("Error: File does not exist."); 
        } 
    } 
} 