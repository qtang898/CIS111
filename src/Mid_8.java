import java.util.Scanner;

public class Mid_8 {
    public static void main(String[] args) {
        // ask user for sentence
        System.out.println("Please enter a sentence. If the input is empty, the default sentence will be used.");
        //initialize scanner object
        Scanner scanner = new Scanner(System.in);
        //assign input sentence to sentence
        String sentence= scanner.nextLine();
        //if sentence is empty, use default sentence
        if (sentence.isEmpty()) {
            sentence = "Crummy class grumble moan";
        }

        //initialize count variables for each vowel is 0
        int countVowels =0, countConsonants=0;

        //loop through sentence
        for (int i = 0; i < sentence.length(); i++) {
            //assign each letter to ch and convert to lowercase
            char ch=sentence.toLowerCase().charAt(i);
            //if letter is a vowel, add 1 to count
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                countVowels++;
            }else if(ch>='a' && ch<='z'){ //after if char is for a to z add 1 to count
                countConsonants++;
            }
        }

        //print results
        System.out.println("Your sentence is: "+sentence+". Has a total of "+countVowels+" vowels and "+countConsonants+" consonants. ");
    }
}
