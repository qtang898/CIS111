import java.util.Scanner;

public class Mid_7 {
    public static void main(String[] args) {
        // initialize variable
        int howManyTime=0, howManyPositivet =0,sum=0;

        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        // ask user to input a number
        System.out.println("Please enter a number, 0 to exit.");

        //start loop
        while (true){
            // this while is check if input is a number
            while (!scanner.hasNextInt()) {
                System.out.println("You did not enter a number. Please try again.");
                scanner.next();
            }

            int inputNumber = scanner.nextInt();
            // if user input 0, exit
            if (inputNumber==0){
                break;
            }

            //record how many times user input
            howManyTime++;
            //if user input a positive number
            if (inputNumber>0){
                howManyPositivet++;
                sum+=inputNumber;
            }
        }

        // print result
        System.out.println("You total entered: " + howManyTime + " times, positive is: "+ howManyPositivet +" times and the sum is " + sum);

    }
}
