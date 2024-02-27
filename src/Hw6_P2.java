import java.util.Scanner;

public class Hw6_P2 {
    public static void main(String[] args) {
        // ask user for sentence
        System.out.println("Please enter a sentence. If the input is empty, the default sentence will be used.");
        //initialize scanner object
        Scanner scanner = new Scanner(System.in);
        //assign input sentence to sentence
        String sentence= scanner.nextLine();
        //if sentence is empty, use default sentence
        if (sentence.isEmpty()) {
            sentence = "The quick brown fox jumps over the lazy dog";
        }

        //initialize count variables for each vowel is 0
        int countA=0, countE=0, countI=0, countO=0, countU=0;

        //loop through sentence
        for (int i = 0; i < sentence.length(); i++) {
            //assign each letter to ch and convert to lowercase
            char ch=sentence.toLowerCase().charAt(i);

            if (ch=='a') {
                countA++;
            }
            if (ch=='e') {
                countE++;
            }
            if (ch=='i') {
                countI++;
            }
            if (ch=='o') {
                countO++;
            }
            if (ch=='u') {
                countU++;
            }
        }

        //print results
        System.out.println("Your sentence is: "+sentence+". The number of times vowels appear in this sentence are:");
        System.out.println("a: "+countA+". \ne: "+countE+". \ni: "+countI+". \no: "+countO+". \nu: "+countU+".");

    }
}
