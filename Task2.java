import java.util.Scanner;

public class Task2 {

    static int  = 100; // static variable

    int = 50; // instance variable

    public static void main(String[] args) {

        int localVar = 20; // local variable

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Division not possible");
        } else {
            System.out.printf("Division: %.2f\n", (double) a / b);
        }

        sc.close();
    }
}
