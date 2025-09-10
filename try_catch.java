import java.util.*;
public class try_catch{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        try{
            String n=null;
            System.out.println(n.length());
        }
        catch(NullPointerException e){
            System.out.println("Null error");
        }
        finally{
            read.close();
            System.out.println("Statement Executed!");
        }
    }
}