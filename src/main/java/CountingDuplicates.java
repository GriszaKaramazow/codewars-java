import java.util.*;

// 6kyu Counting Duplicates
// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
public class CountingDuplicates {

    public static int duplicateCount(String text) {
        List<String> lettersList = new ArrayList<>(Arrays.asList(text.toLowerCase().split("")));
        Set<String> lettersSet = new HashSet<>(lettersList);
        Set<String> duplicates = new HashSet<>();
        for (String letter : lettersList) {
            if(lettersSet.contains(letter)) {
                lettersSet.remove(letter);
            } else {
                duplicates.add(letter);
            }
        }
        return duplicates.size();
    }

}
