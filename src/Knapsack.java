import java.util.*;

public class Knapsack {
    public static int optimalWeight(int W, int[] w) {
        int bars = w.length;
        int[][] value = new int[W+1][bars+1];
        Arrays.fill(value[0], 0);
        for (int i = 0; i <= W; i++)
            value[i][0] = 0;

        for (int i = 1; i <= bars; i++)
            for (int j = 1; j <= W; j++) {
                value[j][i] = value[j][i-1];
                if (w[i-1] <= j) {
                    int val = value[j - w[i-1]][i-1] + w[i-1];
                    if (value[j][i] < val)
                        value[j][i] = val;
                }
            }

        return value[W][bars];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

