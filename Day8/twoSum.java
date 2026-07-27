package Array_pratices.Day8;

public class twoSum {

    public static int[] twoSums(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int item2 = nums[j];

                if ((item + item2) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 8, 9, 5, 4 };
        int target = 9;
        twoSums(nums, target);
    }
}
