import java.util.Scanner;

/**
 * Created by kimdonghyun on 17/10/2019.
 * Baek 11726
 */
public class Tiling2xN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) {System.out.println(1%10007); System.exit(0);}
        if(n==2) {System.out.println(2%10007); System.exit(0);}
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 2;
        for (int i = 3; i <= n; i++) dp[i] = dp[i-1]+dp[i-2];
        System.out.println(dp[n]%10007);
    }
}
