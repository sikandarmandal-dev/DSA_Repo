package Array_pratices.Day12;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int findMinDiff(int[] arr, int m) {

        if (m == 0 || arr.length == 0)
            return 0;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {

            int diff = arr[i + m - 1] - arr[i];

            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;

        System.out.println(findMinDiff(arr, m));
    }
}
