package Array_pratices.Day1;

import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(marks[0] + " this is phy marks");
        System.out.println(marks[1] + " this is che marks");
        System.out.println(marks[2] + " this is math marks");

        sc.close();
    }
}
