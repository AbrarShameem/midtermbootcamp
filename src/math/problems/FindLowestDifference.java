package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String []args){
        int [] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int [] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int m = 8, n = 8;

        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0, b = 0, res = Integer.MAX_VALUE;

        while(a < m && b < n) {
            if ((array1[a] - array2[b]) < res) {
                res = (array1[a] - array2[b]);
            }

            if (array1[a] < array2[b]) {
                a++;
            }
            else {
                b++;
            }
        }

        System.out.println("Lowest Difference = " + res);
    }
}
