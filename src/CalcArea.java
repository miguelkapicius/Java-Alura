import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        double area = 0;

        System.out.println("""
                1- Square area
                2- Circle area
                3- Exit
                """);
        int option = reading.nextInt();

        if (option == 1) {
            double side = reading.nextDouble();
            area = side * side;
            System.out.println("The square area is: " + area);
        } else if (option == 2){
            double radio = reading.nextDouble();
            area = 3.14 * radio * radio;
            System.out.println("The circle area is: " + area);
        } else {
            System.out.println("Exiting...");
        }
    }
}
