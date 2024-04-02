import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = reading.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }
}
