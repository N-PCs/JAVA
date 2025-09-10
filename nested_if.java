/*
import java.util.Scanner;
public class nested_if{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number x : ");
        int x=s.nextInt();
        System.out.println("enter another number y : ");
        int y =s.nextInt();
        if(x>y){
            if(x==1){
                System.out.println("X is equal to 1");
            }
            System.out.println("X is greater than Y");
        }
        else{
            System.out.println("Y is greater than X");
        }
    }
}
*/
import java.util.Scanner;
public class nested_if{
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = read.nextInt();
        if (num < 100) {
            System.out.println("\nGiven number is below 100");
            if (num % 2 == 0)
                System.out.println("And it is EVEN");
            else
                System.out.println("And it is ODD");
        } else
            System.out.println("Given number is not below 100");

        System.out.println("\nWe are outside the if-block!!!");
        read.close();
    }
}
