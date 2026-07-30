package Array_pratices.Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[start] + nums[end];

                if (sum == -nums[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    ans.add(list);

                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start - 1])
                        start++;

                    while (start < end && nums[end] == nums[end + 1])
                        end--;
                } else if (sum < -nums[i]) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return ans;
    }

    // public static void main(String[] args) {
    // int nums[] = { 4, 9, 8, 2, 6, 4 };
    // three
    // }

}
