import java.util.Scanner;

public class Hw6_P3 {
    public static void main(String[] args) {
        // ask user for number
        System.out.println("Please enter a number");

        // initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // check if input is a number, if not, ask again
        while (!scanner.hasNextInt()) {
            System.out.println("You did not enter a number. Please try again.");
            scanner.next();
        }
        System.out.println("You entered a number: " + scanner.nextInt());
    }
}
