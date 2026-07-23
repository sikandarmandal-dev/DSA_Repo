package Array_pratices.Day4;

public class kadansAlgo {
    public static void kadanesAlgorithm(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < numbers.length; i++) {
            curr = curr + numbers[i];

            if (curr < 0) {
                curr = 0;
            }
            max = Math.max(max, curr);
        }
        System.out.println("Maximum sum of this array is = " + max);

    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesAlgorithm(numbers);
    }
}
