// 6kyu Tribonacci Sequence
// https://www.codewars.com/kata/585d7d5adb20cf33cb000235
public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            if (i < 3) {
                array[i] = s[i];
            } else {
                array[i] = array[i-1] + array[i-2] + array[i-3];
            }
        }
        return array;
    }
}