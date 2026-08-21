package Array_pratices.Day30;

public class FriendsPairProblem {
    public static int FrindsPair(int n) {
        if (n == 1 | n == 2) {
            return n;
        }
        int fnm1 = FrindsPair(n - 1);
        int fnm2 = FrindsPair(n - 2);

        int pairWays = n - 1 * fnm2;
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(FrindsPair(n));
    }
}
