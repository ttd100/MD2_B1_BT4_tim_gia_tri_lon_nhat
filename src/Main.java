import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the temperature:");
                    double f = sc.nextInt();
                    double c = 5.0 / 9 * (f - 32);
                    System.out.println("Fahrenheit to Celsius: " + c);
                    break;
                case 2:
                    System.out.println("Enter the temperature:");
                    double c1 = sc.nextInt();
                    double f1 = 9.0 / 5 * c1 + 32;
                    System.out.println("Celsius to Fahrenheit: " + f1);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}