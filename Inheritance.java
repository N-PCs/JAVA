public class Inheritance {
    public static class Parent{
        int n=10;
        double f=8.0;
        public static void Parent(){
            System.out.println("hello child from parent! ");
            System.out.println("function called automatically! ");
        }
        public static void Parent(String a){
            System.out.println("hello child from parent! ");
            System.out.println("function called by "+a);
        }
    }
    public static class Child extends Parent{
        int g=16;
    }
    public static void main(String[] args){
        Parent n=new Parent();
        Child m=new Child();
        System.out.println(m.g);
        System.out.println(n.n);
        System.out.println(n.f);
        System.out.println(m.g*n.f);
        System.out.println(m.g*m.f);
        System.out.println(m.g*m.n);
        m.Parent("Child");                              //accessing parent class fucntions using child class objects
        m.Parent();
    }   
}


