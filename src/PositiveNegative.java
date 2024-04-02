import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = reading.nextInt();

        if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }
}
