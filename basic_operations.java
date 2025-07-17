public class basic_operations {
    public static void main(String[] args) {
        System.out.println("=== JAVA BASIC OPERATIONS DEMO ===\n");
        
        // Variables for demonstration
        int a = 15, b = 4;
        double x = 10.5, y = 3.2;
        boolean flag1 = true, flag2 = false;
        
        // 1. ARITHMETIC OPERATIONS
        System.out.println("1. ARITHMETIC OPERATIONS:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: a + b = " + (a + b));
        System.out.println("Subtraction: a - b = " + (a - b));
        System.out.println("Multiplication: a * b = " + (a * b));
        System.out.println("Division: a / b = " + (a / b));
        System.out.println("Modulus: a % b = " + (a % b));
        System.out.println("Double division: " + x + " / " + y + " = " + (x / y));
        System.out.println();
        
        // 2. UNARY OPERATIONS
        System.out.println("2. UNARY OPERATIONS:");
        int num = 10;
        System.out.println("Original num = " + num);
        System.out.println("Pre-increment: ++num = " + (++num));
        System.out.println("Post-increment: num++ = " + (num++));
        System.out.println("After post-increment: num = " + num);
        System.out.println("Pre-decrement: --num = " + (--num));
        System.out.println("Post-decrement: num-- = " + (num--));
        System.out.println("After post-decrement: num = " + num);
        System.out.println("Unary minus: -num = " + (-num));
        System.out.println("Unary plus: +num = " + (+num));
        System.out.println();
        
        // 3. ASSIGNMENT OPERATIONS
        System.out.println("3. ASSIGNMENT OPERATIONS:");
        int c = 20;
        System.out.println("Initial c = " + c);
        c += 5; System.out.println("c += 5: c = " + c);
        c -= 3; System.out.println("c -= 3: c = " + c);
        c *= 2; System.out.println("c *= 2: c = " + c);
        c /= 4; System.out.println("c /= 4: c = " + c);
        c %= 3; System.out.println("c %= 3: c = " + c);
        System.out.println();
        
        // 4. COMPARISON OPERATIONS
        System.out.println("4. COMPARISON OPERATIONS:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();
        
        // 5. LOGICAL OPERATIONS
        System.out.println("5. LOGICAL OPERATIONS:");
        System.out.println("flag1 = " + flag1 + ", flag2 = " + flag2);
        System.out.println("flag1 && flag2: " + (flag1 && flag2));
        System.out.println("flag1 || flag2: " + (flag1 || flag2));
        System.out.println("!flag1: " + (!flag1));
        System.out.println("!flag2: " + (!flag2));
        System.out.println();
        
        // 6. BITWISE OPERATIONS
        System.out.println("6. BITWISE OPERATIONS:");
        int p = 12, q = 7; // 12 = 1100, 7 = 0111 in binary
        System.out.println("p = " + p + " (binary: " + Integer.toBinaryString(p) + ")");
        System.out.println("q = " + q + " (binary: " + Integer.toBinaryString(q) + ")");
        System.out.println("p & q (AND): " + (p & q) + " (binary: " + Integer.toBinaryString(p & q) + ")");
        System.out.println("p | q (OR): " + (p | q) + " (binary: " + Integer.toBinaryString(p | q) + ")");
        System.out.println("p ^ q (XOR): " + (p ^ q) + " (binary: " + Integer.toBinaryString(p ^ q) + ")");
        System.out.println("~p (NOT): " + (~p) + " (binary: " + Integer.toBinaryString(~p) + ")");
        System.out.println("p << 2 (Left shift): " + (p << 2) + " (binary: " + Integer.toBinaryString(p << 2) + ")");
        System.out.println("p >> 2 (Right shift): " + (p >> 2) + " (binary: " + Integer.toBinaryString(p >> 2) + ")");
        System.out.println();
        
        // 7. TERNARY OPERATION
        System.out.println("7. TERNARY OPERATION:");
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        String result = (a % 2 == 0) ? "even" : "odd";
        System.out.println(a + " is " + result);
        System.out.println();
        
        // 8. STRING OPERATIONS
        System.out.println("8. STRING OPERATIONS:");
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1 = \"" + str1 + "\"");
        System.out.println("str2 = \"" + str2 + "\"");
        System.out.println("Concatenation: str1 + str2 = \"" + (str1 + str2) + "\"");
        System.out.println("With space: str1 + \" \" + str2 = \"" + (str1 + " " + str2) + "\"");
        System.out.println("String length: str1.length() = " + str1.length());
        System.out.println("String equality: str1.equals(str2) = " + str1.equals(str2));
        System.out.println("String comparison: str1.compareTo(str2) = " + str1.compareTo(str2));
        System.out.println();
        
        // 9. TYPE CASTING
        System.out.println("9. TYPE CASTING:");
        int intVal = 100;
        double doubleVal = 25.75;
        System.out.println("Original int: " + intVal);
        System.out.println("Original double: " + doubleVal);
        System.out.println("int to double (implicit): " + (double)intVal);
        System.out.println("double to int (explicit): " + (int)doubleVal);
        System.out.println("int to char: " + (char)intVal);
        System.out.println();
        
        // 10. MATHEMATICAL OPERATIONS
        System.out.println("10. MATHEMATICAL OPERATIONS:");
        double angle = 45.0;
        System.out.println("Math.abs(-15): " + Math.abs(-15));
        System.out.println("Math.max(10, 20): " + Math.max(10, 20));
        System.out.println("Math.min(10, 20): " + Math.min(10, 20));
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        System.out.println("Math.sin(" + angle + "°): " + Math.sin(Math.toRadians(angle)));
        System.out.println("Math.cos(" + angle + "°): " + Math.cos(Math.toRadians(angle)));
        System.out.println("Math.random(): " + Math.random());
        System.out.println();
        
        // 11. ARRAY OPERATIONS
        System.out.println("11. ARRAY OPERATIONS:");
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
        // Array sum
        int sum = 0;
        for (int num2 : numbers) {
            sum += num2;
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println();
        
        // 12. CONDITIONAL OPERATIONS
        System.out.println("12. CONDITIONAL OPERATIONS:");
        int score = 85;
        System.out.println("Score: " + score);
        
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Switch statement
        int day = 3;
        System.out.println("Day number: " + day);
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            default: System.out.println("Weekend");
        }
        System.out.println();
        
        // 13. LOOP OPERATIONS
        System.out.println("13. LOOP OPERATIONS:");
        
        // For loop
        System.out.print("For loop (1-5): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // While loop
        System.out.print("While loop (countdown 5-1): ");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        
        // Do-while loop
        System.out.print("Do-while loop (1-3): ");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);
        System.out.println();
        
        System.out.println("\n=== END OF BASIC OPERATIONS DEMO ===");
    }
}