//Baek 2579
import java.util.Scanner;
class ClimingStairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] point = new int[n+1];
        for(int i =1; i<= n; i++) point[i]=sc.nextInt();
        System.out.println(new ClimingStairs().solution(point,n));
    }
    int solution(int[] point, int n){
        int[] dp = new int[n+1];
        dp[1] = point[1];
        dp[2] = point[1]+point[2];
        dp[3] = Math.max(point[1]+point[3], point[2]+point[3]);
        for(int i =4; i<=n; i++){
            dp[i] = Math.max(dp[i-2]+point[i],dp[i-3]+point[i-1]+point[i]);
        }
        return dp[n];
    }
}