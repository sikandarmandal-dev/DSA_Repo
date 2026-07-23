package Array_pratices.Day1;

public class LinearSearch {
    public static int FindKey(int data[], int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int data[] = { 10, 54, 85, 98, 65, 25, 34, 25 };
        int key = 98;

        int index = FindKey(data, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index " + index);
        }
    }
}
