public class Classes {
    public static class New{
        int a=10;
        int b=20;
        void display() {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        };
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        New n=new New();
        n.display();
        System.out.println("This is a Java class example.");
    }
}