import java.util.Arrays;

// 5kyu Maximum subarray sum
// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
public class Max {

    public static int sequence(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int size = 0; size < arr.length; size++) {
            for (int i = 0; i < arr.length; i++) {
                int[] subArr = Arrays.copyOfRange(arr, i, i + size);
                if (Arrays.stream(subArr).sum() > result) {
                    result = Arrays.stream(subArr).sum();
                }
            }
        }
        return Math.max(result, 0);
    }

}
