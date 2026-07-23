package Array_pratices.Day2;

public class PairsInArray {
    public static void PairsArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int initial = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + initial + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        PairsArray(numbers);
    }
}
