import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> UserInput = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int end = 1;
        
        while (end != 0) {
            System.out.print("Enter a number: ");
            
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            System.out.println("You entered: " + a + " and " + b);
            // Scanner operators = new Scanner(System.in);
            String calc = scanner.next();
            switch (calc) {
                case "w":
                    System.out.println(a + b);
                    break;
                case "x":
                    System.out.println(a - b);
                    break;
                case "y":
                    System.out.println(a * b);
                    break;
                case "z":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Error");

            }
            System.out.println("do you want to exit program?");
            end = scanner.nextInt();
        }

    }
}
