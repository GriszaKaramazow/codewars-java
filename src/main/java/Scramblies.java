import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 5kyu Scramblies
// https://www.codewars.com/kata/55c04b4cc56a697bb0000048
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        List<String> str1List = new ArrayList<>(Arrays.asList(str1.toLowerCase().split("")));
        System.out.println(str1List.toString());
        List<String> str2List = new ArrayList<>(Arrays.asList(str2.toLowerCase().split("")));
        System.out.println(str2List.toString());
        for (String letter : str2List) {
            if (!str1List.contains(letter)) {
                return false;
            }
            str1List.remove(letter);
        }
        return true;
    }

}
