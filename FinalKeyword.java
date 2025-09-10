public class FinalKeyword {
    final double PI = 3.14;
    
    double area(int radius) {
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        FinalKeyword example = new FinalKeyword();
        int radius = 5;
        System.out.println("Area of circle with radius " + radius + 
                          " is: " + example.area(radius));
    }
}