package Array_pratices.Day9;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int heights = Math.min(height[left], height[right]);
            int area = width * heights;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = { 5, 6, 2, 8, 4, 5, 2 };
        maxArea(height);
    }
}
