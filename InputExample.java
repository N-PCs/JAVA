import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        double num = 2;
        
        // Try-with-resources automatically closes the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
            
            System.out.println("preincrement " + (++num));    // num becomes 3, prints 3
            System.out.println("postincrement " + (num++));   // prints 3, then num becomes 4
            System.out.println("Final value: " + num);        // prints 4
        }
    }   
}
