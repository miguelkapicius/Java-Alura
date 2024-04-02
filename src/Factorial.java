import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = reading.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}