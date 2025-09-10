import java.util.*;
public class ConstructorTypes {
    String car;
    int price;

    public ConstructorTypes(){
        System.out.println("hello world!");
    }
    public ConstructorTypes(String c,int p){
        car=c;
        price=p;
        System.out.println(c);
        System.out.println(p);
    }
    public static void main(String[] args){
        ConstructorTypes p=new ConstructorTypes("NISSAN",2000000);
        ConstructorTypes d=new ConstructorTypes();
        System.out.println(p.car);
        System.out.println(d);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of car and its current price : ");
        String carname=scanner.next();
        int prices=scanner.nextInt();

        ConstructorTypes n=new ConstructorTypes(carname,prices);
        System.out.println(n.price);
        scanner.close();
    }
    
}
