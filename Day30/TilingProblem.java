package Array_pratices.Day30;

public class TilingProblem {
    public static int Tiling(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        int fnm1 = Tiling(n - 1);
        int fnm2 = Tiling(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Tiling(n));
    }
}
