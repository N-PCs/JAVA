public class JavaMethodWithVariableArgs {
    void display(int... list) {
        System.out.println("\nNumber of arguments: " + list.length);
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }
    public static void main(String[] args) {
        JavaMethodWithVariableArgs obj = new JavaMethodWithVariableArgs();
        obj.display(1, 2);
        obj.display(10, 20, 30, 40, 50);
    }
}
