package Array_pratices.Day14;

import java.util.*;

public class permutationInArray {

    public boolean isPossible(int k, int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n = arr2.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[n - 1 - i];
            arr2[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            if (arr1[i] + arr2[i] < k) {
                return false;
            }
        }

        return true;
    }
}
