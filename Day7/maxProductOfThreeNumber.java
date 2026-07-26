package Array_pratices.Day7;

public class maxProductOfThreeNumber {
    public static int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    max = Math.max(max, nums[i] * nums[j] * nums[k]);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 8, 5 };
        System.out.println(maximumProduct(nums));
    }
}
