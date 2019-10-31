# TIL - CodingTest Practice 
### 2019.10.31 Thr

## BaekJoon 9461 - 파도반수열 (DP)

![image](https://user-images.githubusercontent.com/46931527/67926359-2d7b6200-fbf9-11e9-98d0-b356a8d979f5.png)


```
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kimdonghyun on 31/10/2019.
 */
public class Baek_9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] testCaseArr = new int[n+1];
        for(int i = 1; i<=n; i++) testCaseArr[i] = sc.nextInt();
        Arrays.sort(testCaseArr);
        solution(testCaseArr);
    }
    static void solution(int[] testCaseArr){
        int maxValue = testCaseArr[testCaseArr.length-1];
        long[] dp = new long[maxValue+1];
        if(maxValue>=1) dp[1] = 1;
        if(maxValue>=2) dp[2] = 1;
        if(maxValue>=3) dp[3] = 1;
        if(maxValue>=4) dp[4] = 2;
        if(maxValue>=5) dp[5] = 2;
        for(int i = 6; i<=maxValue; i++){
            dp[i] = dp[i-1] + dp[i-5];
        }
        for (int i = 1; i <= testCaseArr.length-1; i++) {
            System.out.println(dp[testCaseArr[i]]);
        }
    }
}


```

## Code Review

|1, 1, 1, 2, 2, 3, 4, 5, 7, 9|
|---|
|1, 2, 3, 4, 5, 6, 7, 8, 9, 10|

윗줄이 삼각형값 밑줄이 i번째 순서이다.<br>
6번째부터 보자 6번쨰는 3이다.<br>
6번쨰 3 = 2+1<br>
7번쨰 4 = 3+1<br>
8번쨰 5 = 4+1<br>
9번쨰 7 = 5+2<br>
10번쨰 9 = 7+2<br><br>

보면 1~5번째 까지 값들이 뒤에 + 된걸 볼수있다. <br>그래서 
dp[i] = dp[i-1] + dp[i-5] 점화식이 만들어지고<br>
N <= 100 이기떄문에 int범위를 벗어나기 떄문에
long 으로 dp[] 선언해서 값을 구했다.



