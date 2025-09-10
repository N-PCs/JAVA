import java.util.Scanner;
public class JavaMethodsExample {
    int sNo;
    String name;
    Scanner read = new Scanner(System.in);
    void readData() {
        System.out.print("Enter Serial Number: ");
        sNo = read.nextInt();
        System.out.print("Enter the Name: ");
        name = read.next();
    }
    static void showData(int sNo, String name) {
        System.out.println("Hello, " + name + "! your serial number is " + sNo);
    }
    public static void main(String[] args) {

        JavaMethodsExample obj = new JavaMethodsExample();

        obj.readData();   // method call using object

        showData(obj.sNo, obj.name);  // method call without using object
    }
}