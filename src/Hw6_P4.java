import java.util.Scanner;

public class Hw6_P4 {
    public static void main(String[] args) {
        // initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // ask user for maze's columns
        System.out.println("Please enter a number for the columns of the maze:");
        // check if input is a number, if not, ask again
        while (!scanner.hasNextInt()) {
            System.out.println("You did not enter a number. Please try again.");
            scanner.next();
        }
        int columns = scanner.nextInt();

        // ask user for maze's rows
        System.out.println("Please enter a number for the rows of the maze:");
        // check if input is a number, if not, ask again
        while (!scanner.hasNextInt()) {
            System.out.println("You did not enter a number. Please try again.");
            scanner.next();
        }
        int rows = scanner.nextInt();
        // generate maze
        System.out.println("The system will generate a random maze with "+rows+" rows and "+columns+" columns：" );
        // generate maze's rows
        for (int i = 0; i < rows; i++) {
            // generate maze's columns
            for (int j = 0; j < columns; j++) {
                //if the first or last row or the first or last column, print "#"
                if (i==0 || j==0 || i==rows-1 || j==columns-1) {
                    System.out.print("# ");
                }else {
                    //if random number is 0, print "#", else print "  "
                    if ((int)(Math.random()*2)==0) {
                        System.out.print("# ");
                    }else{
                     System.out.print("  ");
                    }
                }
            }
            // print new line
            System.out.println();
        }
    }
}
