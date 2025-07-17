public class typecasting {
    public static void main(String[] args) {
        int num = 100;
        double d = num; // Implicit typecasting: int to double
        System.out.println(d);
        double e = 99.99;
        int num1 = (int) e; // Explicit typecasting: double to int
        System.out.println(num1); // Output: 99
    }

}
/*  class Animal {} 
    class Dog extends Animal {} 
    Animal animal = new Dog(); // Upcasting 
    Dog dog = (Dog) animal;    // Downcasting
*/