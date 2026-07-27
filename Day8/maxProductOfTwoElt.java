package Array_pratices.Day8;

public class maxProductOfTwoElt {

    public static int maxProduct(int[] nums) {

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                maxValue = Math.max((nums[i] - 1) * (nums[j] - 1), maxValue);
            }
        }
        return maxValue;

    }

    public static void main(String[] args) {
        int nums[] = { 5, 8, 8, 9, 5 };
        maxProduct(nums);
    }
}
