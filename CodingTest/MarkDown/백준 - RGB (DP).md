# TIL - CodingTest Practice 
### 2019.10.21 Mon

## 백준 - RGB (DP)

RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이고, 첫 집과 마지막 집은 이웃이 아니다.

각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠하는 비용의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로, 초록으로, 파랑으로 칠하는 비용이 주어진다. 비용은 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.

예제 입력 1 <br>
3<br>
26 40 83<br>
49 60 57<br>
13 89 99<br><br>
예제 출력 1 <br>
96<br>

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by kimdonghyun on 17/10/2019.
 */
public class RGB {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sArr;
        int[][] rgb = new int[n][3];
        for (int i = 0; i < n; i++) {
            sArr = br.readLine().split(" ");
            rgb[i][0] = Integer.parseInt(sArr[0]);
            rgb[i][1] = Integer.parseInt(sArr[1]);
            rgb[i][2] = Integer.parseInt(sArr[2]);
        }
        System.out.println(solution(rgb, n));
    }
    static int solution(int[][] rgb, int n ){
        for (int i = 1; i <n ; i++) {
            rgb[i][0] += Math.min(rgb[i-1][1],rgb[i-1][2]);
            rgb[i][1] += Math.min(rgb[i-1][0],rgb[i-1][2]);
            rgb[i][2] += Math.min(rgb[i-1][0],rgb[i-1][1]);
        }
        return Math.min(rgb[n-1][2],Math.min(rgb[n-1][0],rgb[n-1][1]));
    }
}

```

## Code Review

점화식 :  rgb[i][0] += Math.min(rgb[i-1][1],rgb[i-1][2])

설명하자면 [i][0]은 [i-1][0] 이 될수 없다 0 이웃한 (붙어있는) 집끼리 색이 같을 수 없기 떄문에 [0]이 아닌 [1],[2] 가 되야 하며 다른 라인도 이와같이 구하면 결과값에 도달한다.

