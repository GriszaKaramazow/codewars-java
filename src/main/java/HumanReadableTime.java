// 5kyu Human Readable Time
public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        String sec = String.valueOf(seconds % 60);
        if (sec.length() == 1) {
            sec = "0" + sec;
        }
        seconds /= 60;
        String min = String.valueOf(seconds % 60);
        if (min.length() == 1) {
            min = "0" + min;
        }
        String hr = String.valueOf(seconds / 60);
        if (hr.length() == 1) {
            hr = "0" + hr;
        }
        return hr + ":" + min + ":" + sec;
    }

}
