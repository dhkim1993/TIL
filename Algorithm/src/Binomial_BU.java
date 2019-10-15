/**
 * Created by kimdonghyun on 15/10/2019.
 */
public class Binomial_BU {
    int[][] binom = new int[100][100];

    public static void main(String[] args) {
        System.out.println(new Binomial_BU().binomial(6, 3));
    }

    int binomial(int n, int k) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k && j <= i; j++) {
                if (j == 0 || i == j) binom[i][j] = 1;
                else binom[i][j] = binom[i - 1][j - 1] + binom[i - 1][j];
            }
        }
        return binom[n][k];
    }
}
