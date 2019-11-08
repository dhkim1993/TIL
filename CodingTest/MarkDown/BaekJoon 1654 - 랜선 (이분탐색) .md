# TIL - CodingTest Practice 
### 2019.11.08 Fri

## BaekJoon 1654 - 랜선 (이분탐색)

<img width="1147" alt="스크린샷 2019-11-08 오후 3 56 56" src="https://user-images.githubusercontent.com/46931527/68456212-989fe680-0240-11ea-8880-b06b95718555.png">


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kimdonghyun on 07/11/2019.
 */
public class Baek_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int k = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        long max=0;
        long min =1;
        int[] line = new int[k];
        for (int i = 0; i < k; i++) {
            line[i] = Integer.parseInt(br.readLine());;
            max = Math.max(line[i],max);
        }
        System.out.println(solution(line,max,min,n));
    }
    static long solution(int[] line, long max, long min, int n){
        long mid=0;
        while(max>=min){
            mid = (max+min)/2;
            long lineCnt=0;
            for (int i = 0; i < line.length; i++)
                lineCnt += line[i]/mid;

            if(lineCnt >= n) min = mid+1;
            else max = mid-1;
        }
        return max;
    }
}


```

## Code Review
맞는거 같은데 자꾸 틀리다고 나와서 int를 long으로 바꿔봤더니 맞았다.. 한참 시간 잡아먹었네..<br>
일단 랜선길이 중에서 가장 큰값을 max에 저장해서 max와 min=1 /2 한 mid 로 비교하면서 연산한다. <br>
if(lineCnt >= n) 여기서 같거나 크면 mid값이 작다는 말이기 떄문에 mid값을 더 증가시켜줘야한다. <br>그래서 mid을 mid+1 시키고 반대로
lineCnt가 작다면 mid값이 너무 크다는 말이기 때문에 max를 mid-1 로 바꿔준다.<br>
이렇게 반복하다가 while의 조건이 false되면 max를 출력.


