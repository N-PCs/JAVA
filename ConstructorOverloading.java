public class ConstructorOverloading {
    public int number;
    public String text;
    
    // Default constructor
    public ConstructorOverloading() {
        number = 0;
        text = "default";
    }
    
    // Constructor with number parameter
    public ConstructorOverloading(int num) {
        number = num;
        text = "numberOnly";
    }
    
    // Constructor with text parameter
    public ConstructorOverloading(String txt) {
        number = 0;
        text = txt;
    }
    
    // Constructor with both number and text parameters
    public ConstructorOverloading(int num, String txt) {
        number = num;
        text = txt;
    }
    
    // Method to display object values
    public void display() {
        System.out.println("Number: " + number + ", Text: " + text);
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading("Hello");
        ConstructorOverloading obj4 = new ConstructorOverloading(20, "World");
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }

}
