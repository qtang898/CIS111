public class Hw_MethodLect_1 {
    public static void main(String[] args) {
        System.out.print("Hello World!");

        int howManyLetter=0;
        howManyLetter=countLetter("how are you today?",'e');
    }

    public static int countLetter(String wordToBeAnalyzed, char letterToBeCounted) {
        int answer = 0;
        for(int i = 0; i < wordToBeAnalyzed.length(); i++) {
            if(wordToBeAnalyzed.charAt(i) == letterToBeCounted) {
                answer++;
            }
        }
        return answer;
    }
}
