import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> UserInput = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int end = 1;
        double n = 3.1415;
        while (end != 0) {
            System.out.print("Enter a number: ");
            if (n == 3.1415) {
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                System.out.println("You entered: " + a + " and " + b);
                // Scanner operators = new Scanner(System.in);
                String calc = scanner.next();
                switch (calc) {
                    case "w":
                        n = (a + b);
                        System.out.println(n);
                        break;
                    case "x":
                        n = (a - b);
                        System.out.println(n);
                        break;
                    case "y":
                        n = (a * b);
                        System.out.println(n);
                        break;
                    case "z":
                        n = (a / b);
                        System.out.println(n);
                        break;
                    default:
                        System.out.println("Error");

                }
                System.out.println("do you want to exit program?");
                end = scanner.nextInt();
            } else {
                float b = scanner.nextFloat();
                System.out.println("You entered: " + n + " and " + b);
                // Scanner operators = new Scanner(System.in);
                String calc = scanner.next();
                switch (calc) {
                    case "w":
                        n = (n + b);
                        System.out.println(n);
                        break;
                    case "x":
                        n = (n - b);
                        System.out.println(n);
                        break;
                    case "y":
                        n = (n * b);
                        System.out.println(n);
                        break;
                    case "z":
                        n = (n / b);
                        System.out.println(n);
                        break;
                    default:
                        System.out.println("Error");

                }
                System.out.println("do you want to exit program?");
                end = scanner.nextInt();
                System.out.println("Program ended");
            }
            
        }

    }
}
