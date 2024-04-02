import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = reading.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
