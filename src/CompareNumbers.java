import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int number1 = reading.nextInt();
        System.out.println("Enter Number 2:");
        int number2 = reading.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 is greater than number 2");
        } else if (number1 < number2) {
            System.out.println("Number 2 is greater than number 1");
        } else {
            System.out.println("number 1 is the same as number 2");
        }
    }
}
