
import java.util.*;


class MinusPlus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int x : arr) {
            if (x < 0) {
                neg++;
            } else if (x > 0) {
                pos++;
            } else {
                zero++;
            }
        }
        int n = arr.size();
        double result = (double) pos / n;

        double result2 = (double) neg / n;
        double result3 = (double) zero / n;

        System.out.printf("%.6f%n", result);
        System.out.printf("%.6f%n", result2);
        System.out.printf("%.6f%n", result3);
    }

    public static void main(String[] args) {

        int[] nums = { -4, -3, -9, 0, 4, 1 };

        List<Integer> arr = new ArrayList<>();

        for (int x : nums) {
            arr.add(x);
        }

        plusMinus(arr);

    }}


