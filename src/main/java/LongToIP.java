import java.util.Arrays;
import java.util.List;

// 5kyu int32 to IPv4
// https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
public class LongToIP {

    public static String longToIP(long ip) {
        List<String> ipList = Arrays.asList("0", "0", "0", "0");
        for (int i = ipList.size() - 1; i >= 0; i--) {
            ipList.set(i, String.valueOf(ip % 256));
            ip /= 256;
        }
        return String.join(".", ipList);
    }

}
