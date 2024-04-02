import java.util.Scanner;

public class Mid_Ext {
    public static void main(String[] args) {
        //ask user for number
        System.out.println("Please a number.");
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        //check if input is a number
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please enter a number.");
        }
        //assign input to num
        int num = scanner.nextInt();
        //Print in reverse order according to user parameters*
        for (int i=num; i>1; i--) {
            //Print * for each line
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            //Print newlines when the line is greater than 2, otherwise just print spaces
            if (i>2) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
        //Start printing in ascending order
        for (int i=2; i<=num; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
