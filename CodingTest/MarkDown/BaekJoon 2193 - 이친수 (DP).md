# TIL - CodingTest Practice 
### 2019.10.21 Mon

## BaekJoon 2193 - 이친수 (DP)

<img width="1190" alt="스크린샷 2019-10-21 오후 9 07 36" src="https://user-images.githubusercontent.com/46931527/67203753-e944d080-f446-11e9-80b5-e4ab6a4d1124.png">


```
import java.util.Scanner;
// 2193
class UtilTest1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }
    static long solution(int n){
        long[] dp = new long[n+1];
        if(n==1 || n==2) return 1;
        else{
            dp[1]=1;
            dp[2]=1;
            for(int i = 3; i<=n; i++)
                dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
```

## Code Review
한번 경우의 수를 구해봤다.<br>
1자리 = 1<br>
2자리 = 1<br>
3 = 2<br>
4 = 3<br>
5 = 5<br>
까지만 구했는데 피보나치가 나왔다. 답은 걍 피보나치 구현하면된다.<br>
근데 조건이 1<= n <= 90 인데 내가알기론 40쯤 좀 넘어가면 int범위를 벗어나는걸로 알고있기 떄문에 long으로 구현.<br>
