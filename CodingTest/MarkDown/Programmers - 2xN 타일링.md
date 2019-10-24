# TIL - CodingTest Practice 
### 2019.10.22 Thu

## Programmers - 2xN 타일링
가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다. 이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다. 타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.<br><br>
타일을 가로로 배치 하는 경우<br>
타일을 세로로 배치 하는 경우<br>

직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.<br>

제한사항<br>
가로의 길이 n은 60,000이하의 자연수 입니다.<br>
경우의 수가 많아 질 수 있으므로, 경우의 수를 1,000,000,007으로 나눈 나머지를 return해주세요.<br><br>
입출력 예<br>

|n	|result|
|---|---|
|4	|5|



```
class Solution {
  public int solution(int n) {
      int[] dp = new int[n+1];
      if(n==0) return 0;
      if(n==1) return 1;
      if(n==2) return 2;
      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 2;
      for(int i =3; i<=n; i++)
          dp[i] = (dp[i-1]+dp[i-2])%1000000007;
      return dp[n];
  }
}
```

## Code Review
n의 갯수를 늘리면서 경우의수를 보니까 피보나치 수열이 나온다. dp배열로 중복 제거 해서 품.

## 다른사람의 풀이 

```
public int tiling(int n) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            int fib = (a + b) % 100000;
            a = b;
            b = fib;
        }
        return b;
    }

```
이분은 피보나치를 구현했다.