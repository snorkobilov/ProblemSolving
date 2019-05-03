public class PlusMinus {

    /*
    You must print the following  lines:

    A decimal representing of the fraction of positive numbers in the array compared to its size.
    A decimal representing of the fraction of negative numbers in the array compared to its size.
    A decimal representing of the fraction of zeros in the array compared to its size.
     */

    public static void plusMinus(int[] arr) {
        var lengthOfArray = (float) arr.length;
        var positive = 0f;
        var negative = 0f;
        var zero = 0f;

        for (int i = 0; i < lengthOfArray; i++) {
            if (arr[i] > 0) {
                ++positive;
            } else if (arr[i] < 0) {
                ++negative;
            } else {
                ++zero;
            }
        }
        System.out.printf(("%.6f\n%.6f\n%.6f"), positive / lengthOfArray, negative / lengthOfArray,
                zero / lengthOfArray);
    }
}