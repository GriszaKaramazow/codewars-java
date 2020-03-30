// 6kyu Split Strings
public class StringSplit {
    
    public static String[] solution(String s) {
        if (s.length()%2 != 0) {
            s += "_";
        }
        int size = s.length() / 2 + s.length() % 2;
        String[] result = new String[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            result[i] = s.substring(counter, counter + 2);
            counter += 2;
        }
        return result;
    }
    
}
