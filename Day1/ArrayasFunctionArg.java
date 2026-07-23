package Array_pratices.Day1;

public class ArrayasFunctionArg {
    public void updateArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 85, 65, 98 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
