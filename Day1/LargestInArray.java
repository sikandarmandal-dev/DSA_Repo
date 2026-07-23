package Array_pratices.Day1;

public class LargestInArray {
    public static int findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest value is = " + largest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 35, 41, 52, 85 };
        findLargest(arr);
    }
}
