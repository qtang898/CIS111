import java.util.Scanner;

public class Hw6_P1 {

    public static void main(String[] args) {
        // ask user for multiplication table number
        System.out.println("What number's multiplication table do you want to display?");

        //initialize scanner object
        Scanner scanner = new Scanner(System.in);
        //check if user input is valid, if not stop the program
        if (!scanner.hasNextInt())  {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        //assign user input to variable
        int number = scanner.nextInt();
        //output multiplication table title
        System.out.println("Multiplication table for "+number);
        //output multiplication table
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }

    }
}
