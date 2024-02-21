import java.util.Scanner;

public class Hw5_0 implements Executable {
    @Override
    public void execute() {
        System.out.println("*-----*-----*-----Welcome to HW5_P0!-----*-----*-----*");

        //An infinite loop locks the user into using this module.
        while (true) {

            //Show user menu prompt
            System.out.println("Please use the option to describe the weather conditions: ");
            System.out.println("0). Exit. \n1). Raining. \n2). sun. \n3). Rain and sunshine. \n4). Random input for testing");
            //Get user input
            Scanner scanner = new Scanner(System.in);

            //Check if user input is valid
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();

                //Exit
                if (option == 0) {
                    System.out.println("*-----*-----*-----Thank you for using HW5_0 Bye!! -----*-----*-----*");
                    break;
                }
                System.out.println("******************************************************************");

                // check input is Random or Option
                if (option==4){
                    option = (int) (Math.random() * 3) + 1;
                    System.out.println("*   You chose Random input is : " + option + ".                               *");
                }else{
                    System.out.println("*   You chose Option input is : " + option + ".                               *");
                }
                //Display weather description based on user input
                if (option == 1) {
                    System.out.println("*   According to your description, the weather will rain,        *");
                    System.out.println("*   so I suggest you bring a waterproof jacket.                  *");
                } else if (option == 2) {
                    System.out.println("*   According to your description, the weather will be sunny,    *");
                    System.out.println("*   so I suggest you bring a light jacket.                       *");
                } else {
                    System.out.println("*   The weather can be sunny or rainy,                           *");
                    System.out.println("*   so I suggest you bring a light jacket and waterproof jacket  *");
                    System.out.println("*   it's a bit cumbersome...LOL                                  *");
                }
            } else {
                System.out.println("*   Invalid option");
            }
            System.out.println("******************************************************************");
        }

    }
}