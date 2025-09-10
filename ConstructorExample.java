/*public class ConstructorExample {
    ConstructorExample() {                                          // Constructor is a method that initializes the object
        System.out.println("Object created!");
    }

    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println("First object reference: " + obj1);
        ConstructorExample obj2 = new ConstructorExample();
        System.out.println("Second object reference: " + obj2);
    }

}*/
import java.util.*;
public class ConstructorExample{
    String name;
    int age;
    String course;

    //Constructor
    public ConstructorExample(String n,int a,String c){
        name=n;
        age=a;
        course=c;
        System.out.println("Name of student : "+n);
        System.out.println("Age of student : "+a);
        System.out.println("Course of student : "+c);
    }
    public static void main(String[] args){
        //object
        ConstructorExample s1=new ConstructorExample("NEEL",19,"CSE");  //automatically called
        
        //creating second 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Now write your name,age,course in order :");
        String name2=scanner.next();
        int age2=scanner.nextInt();
        String course2=scanner.next();
        ConstructorExample s2=new ConstructorExample(name2, age2, course2);

        scanner.close();
    }
}


