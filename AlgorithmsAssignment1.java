import java.util.ArrayList;

public class AlgorithmsAssignment1 {
    public static String reverseSentence(String sentence) {
        String reversed = "";
        char[] sentenceArray = sentence.toCharArray();
        ArrayList<Integer> indexesOfSpaces = new ArrayList<>();


        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i] == ' ') {
                indexesOfSpaces.add(i);
            }
        }



        return reversed;
    }
    public static void main(String[] args) {

    }
}
