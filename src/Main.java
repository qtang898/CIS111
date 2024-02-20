import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu(0, "To Exit", new Hw1()));
        menus.add(new Menu(1, "Hello World 1", new Hw1()));
        menus.add(new Menu(2, "Hello World 2", new Hw2()));
        menus.add(new Menu(3, "HomeWork5 P0", new HW5_0()));
        menus.add(new Menu(4, "HomeWork5 P1", new Hw5_1()));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------[Welcome to QiTang's HomeWork]----------");
            System.out.println("Enter the command number");
            for (Menu menu : menus) {
                System.out.println(menu.getId() + ") " + menu.getMenu());
            }
            System.out.println("---------------------------------------------------");
            System.out.println("Please Enter:");

            if (scanner.hasNextInt()) {
                int commandNumber = scanner.nextInt();

                if (commandNumber == 0) {
                    break;
                }
                if (commandNumber > menus.size() - 1) {
                    System.out.println("Invalid command number");
                    continue;
                } else {
                    menus.get(commandNumber).getExecutable().execute();
                }
            } else {
                System.out.println("Invalid command number");
                scanner.next();
                continue;
            }

        }
    }

}