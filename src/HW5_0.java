import java.util.Scanner;

public class HW5_0 implements Executable {
    @Override
    public void execute() {
        System.out.println("*-----*-----*-----Welcome to HW5_P0!-----*-----*-----*");
        while (true) {
            System.out.println("Please use the option to describe the weather conditions: ");
            System.out.println("0). Exit. \n1). Raining. \n2). sun. \n3). Rain and sunshine. \n4). Random input for testing");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                if (option == 0) {
                    System.out.println("*-----*-----*-----Thank you for using HW5_0 Bye!! -----*-----*-----*");
                    break;
                }

                System.out.println("******************************************************************");
                if (option==4){
                    option = (int) (Math.random() * 3) + 1;
                    System.out.println("*   You chose Random input is : " + option + ".                               *");
                }else{
                    System.out.println("*   You chose Option input is : " + option + ".                               *");
                }

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