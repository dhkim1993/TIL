/**
 * Created by kimdonghyun on 15/10/2019.
 */
public class Binomial_Memo {
    static int[][] binom = new int[100][100];

    public static void main(String[] args) {
        System.out.println(new Binomial_Memo().binomial(6, 3));
    }

    int binomial(int n, int k) {
        if (n == k || k == 0) return binom[n][k] = 1;
        else if (binom[n][k] != 0) return binom[n][k];
        return binom[n][k] = binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
}
