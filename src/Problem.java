import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem {

    /* is Array contains dublicates */

    public static boolean containsDublicate(int[] arr) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mySet.add(arr[i])) {
                return true;
            }
        }
        return false;
    }


    /* find the absolute falue of the diagonal sum of the array */

    static int diagonalDifference(int[][] arr) {

        if(arr.length <=1 || arr[1].length != arr.length){
            throw new IllegalArgumentException("Wrong arguments");
        }
        int mainD = 0;
        int secondD = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length; i++) {
            mainD += arr[i][i];
            secondD += arr[i][length - i];
        }
        return Math.abs(mainD - secondD);
    }
}
