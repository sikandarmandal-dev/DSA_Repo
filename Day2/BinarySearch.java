package Array_pratices.Day2;

public class BinarySearch {
    public static int BinaSearchKey(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int midKey = (start + end) / 2;

            if (arr[midKey] == key) {
                return midKey;
            }
            if (arr[midKey] < key) {
                start = midKey + 1;

            } else {
                end = midKey - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 25, 35, 65, 70, 75, 85, 98 };
        int key = 65;
        System.out.println("The index of key is = " + BinaSearchKey(arr, key));
    }
}