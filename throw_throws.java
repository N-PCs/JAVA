
import java.util.*;
public class throw_throws {
    public static void check(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or greater!");
        }
        else{
            System.out.println("U r legal !");
        }
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        try{
            check(n);
        }
        catch(IllegalArgumentException e){
            System.out.println("Illegal input");
        }
        finally{
            read.close();
            System.out.println("Program completed!");
        }
    }
}


