# TIL - CodingTest Practice 
### 2019.10.21 Mon

## BaekJoon 1932 - 정수 삼각형 (DP)

```
import java.util.Scanner;

/**
 * Created by kimdonghyun on 21/10/2019.
 * 1932
 */

public class IntegerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] iArr = new int[n+1][n+1];
        int result = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=i; j++) {
                iArr[i][j] = sc.nextInt();
                if(j==1) iArr[i][j] += iArr[i-1][j];
                else if(i==j) iArr[i][j] += iArr[i-1][j-1];
                else iArr[i][j] += Math.max(iArr[i - 1][j], iArr[i - 1][j - 1]);
                if (iArr[i][j] > result)
                    result = iArr[i][j];
            }
        }
        System.out.println(result);
    }
}

```

## Code Review
최대 비용 경로 찾기 알고리즘과 같은 알고리즘이다.<br> 
예를 들어 1,1 에서 4,4 로 가는데 최대 비용을 구하는 거라면
2,2 는 Math.max(1,2 , 2,1) 둘중 비교하는 것처럼 구현하고, <br>
양쪽 맨 끝 부분만 조건으로 빼서 계산하면된다.
