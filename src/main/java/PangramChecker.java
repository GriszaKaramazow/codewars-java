import java.util.ArrayList;
import java.util.List;

// 6kyu Detect Pangram
public class PangramChecker {

    public boolean check(String sentence){
        char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        List<Character> alphabetList = new ArrayList<>();
        for (char letter : alphabetArray) {
            alphabetList.add(letter);
        }
        char[] sentenceArray = sentence.toLowerCase().toCharArray();
        List<Character> lettersList = new ArrayList<>();
        for (char character : sentenceArray) {
            if (alphabetList.contains(character) && !lettersList.contains(character)) {
                lettersList.add(character);
            }
        }
        return lettersList.size() == 26;
    }

}
