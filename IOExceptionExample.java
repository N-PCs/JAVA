import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) { 
        try { 
            FileReader fr = new FileReader("myfile.txt"); // File may not exist 
            BufferedReader br = new BufferedReader(fr); 
            System.out.println(br.readLine()); 
        }  
        catch (IOException e) { 
        System.out.println("Error: File not found or cannot be read."); 
        } 
        finally{
            System.out.println("IO Exception Detected !");
        }
    }
}
