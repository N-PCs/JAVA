import java.util.Scanner;
public class if_else_statements {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number x: ");
        int x=s.nextInt();
        System.out.println("enter another number y: ");
        int y=s.nextInt();
        if(x>y){
            System.out.println("x is the greater number");
        }
        else if(x<y){
            System.out.println("y is the greater number");
        }
        else{System.out.println("number are equal");
        }
        s.close();
    }   
}

