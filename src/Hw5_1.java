import java.util.HashMap;
import java.util.Scanner;

public class Hw5_1 implements Executable {
    private HashMap<String, Integer> userInfo = new HashMap<>(); // Define global variables userInfo
    private HashMap<String, Integer> attractions = new HashMap<>(); //Define global variables attractions

    @Override
    public void execute() {
        System.out.println("*-----*-----*-----Welcome to HW5_P1 QT Park !-----*-----*-----*");
        //initialization of variables attractions
        attractions.put("Roller coaster", 140);
        attractions.put("Water slide", 120);
        attractions.put("Ferris wheel", 110);
        //output information
        System.out.println("Attraction rules will be as follows：");
        // output table-top and bottom and title
        String roleB = "";
        for (int i = 0; i < 22; i++) {
            roleB = roleB + "-";
        }
        System.out.println("+" + roleB + "+");
        System.out.println("|" + String.format("%-15s", "Attraction") + "| " + String.format("%-5s", "Min") + "|");
        ;
        System.out.println("+" + roleB + "+");

        attractions.forEach((key, value) ->
                {
                    System.out.println("|" + String.format("%-15s", key) + "| " + String.format("%-5s", value) + "|");
                    ;
                }
        );
        System.out.println("+" + roleB + "+");

        //display menu information and lock user int the menu
        while (true) {
            System.out.println("Please enter the command as required:\n0). Exit\n1). Enter information\n2). Clear the information\n3). Display the information");
            Scanner scanner = new Scanner(System.in);
            //check if user input is valid
            if (scanner.hasNextInt()) {
                int commandNumber = scanner.nextInt();
                if (commandNumber == 0) { //exit
                    System.out.println("*-----*-----*-----Thank you for using HW5_1 Bye!! -----*-----*-----*");
                    break;
                }
                if (commandNumber > 3) {
                    System.out.println("Invalid command number");
                    continue;
                }
                switch (commandNumber) {
                    case 1:
                        EnterUserInfo();
                        break;
                    case 2:
                        ClearUserInfo();
                        break;
                    case 3:
                        DisplayResult();
                        break;
                }
            } else {
                System.out.println("Invalid command number");
                continue;
            }
        }
    }

    //method of user input
    public void EnterUserInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the User Name:");
        String userName = scanner.nextLine();
        System.out.println("Please enter the User Tall:");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter the User Tall:");
            scanner.next();
        }
        int userTall = scanner.nextInt();
        //put user in to the userInfo
        userInfo.put(userName, userTall);
        DisplayUserInfo();
    }
    //Clear all the user information
    public void ClearUserInfo() {
        //clear all the user information
        userInfo.clear();
        //display user information
        this.DisplayUserInfo();
    }

    public void DisplayUserInfo() {
        System.out.println(userInfo);
    }

    //Display the result of the user
    public void DisplayResult() {
        //check if there is no user
        if (userInfo.size() == 0) {
            System.out.println("No information has been entered");
        } else {
            //display the result
            System.out.println("The result is as follows:");
            String top = "";
            for (int i = 0; i < 48; i++) {
                top = top + "-";
            }
            System.out.println("+" + top + "+");

            String finalTop = top;
            //display of all the user in the userInfo
            userInfo.forEach((key, value) -> {
                String userInfo="Name:" + key + ", Tall:" + value;
                //display the result with each use
                System.out.println("|"+ String.format("%-48s",userInfo )+"|");
                System.out.println("+" + finalTop + "+");
                System.out.println("|"+ String.format("%-18s","Attractions" )+"|"+ String.format("%-5s","Min" )+"|"+ String.format("%-11s","Available?" )+"|"+ String.format("%-11s","With Adult?" )+"|");
                System.out.println("|" + finalTop + "+");
                //if tall less than 130, adult is required
                String adult;
                if (value <130) {
                    adult="Yes";
                } else {
                    adult = "No";
                }
                //display the attraction with the user information
                attractions.forEach((key1, value1) -> {
                   if (value>=value1){
                       System.out.println("|"+ String.format("%-18s",key1 )+"|"+ String.format("%-5s",value1 )+"|"+ String.format("%-11s","Yes" )+"|"+ String.format("%-11s",adult)+"|");
                   }
                   else {
                       System.out.println("|"+ String.format("%-18s",key1 )+"|"+ String.format("%-5s",value1 )+"|"+ String.format("%-11s","No" )+"|"+ String.format("%-11s",adult)+"|");
                   }
                    System.out.println("+" + finalTop + "+");
               });
        }
        );
    }
    }
}