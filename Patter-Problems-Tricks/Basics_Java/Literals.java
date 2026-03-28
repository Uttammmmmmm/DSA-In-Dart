
import java.util.Scanner;
// What is Literals in Java?
// Literals are the fixed values assigned to variables in the code. They represent constant values that
// do not change during the execution of a program. Literals can be of various data types such as
// integer, floating-point, character, string, and boolean.

public class Literals {
    long population = 454564564642224538L; // long literal`
    float pi = 3.14f; // float literal
    double e = 2.71828; // double literal
    char grade = 'A'; // char literal
    String greeting = "Hello, World!"; // string literal
    boolean isJavaFun = true; // boolean literal

    public static void main(String args[]) {
        System.out.print(new Literals().greeting);

        System.out.print("Taking input from the scanner");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);

    }

}
