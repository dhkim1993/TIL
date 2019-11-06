# TIL - CodingTest Practice 
### 2019.11.06 Wen

## BaekJoon 11650 - 좌표정렬하기

![image](https://user-images.githubusercontent.com/46931527/68281678-86487000-00bb-11ea-8557-90d0c083c801.png)


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by kimdonghyun on 06/11/2019.
 */
public class Baek_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] iArr = new int[n][2];
        String[] sArr;
        for (int i = 0; i < n; i++) {
            sArr = br.readLine().split(" ");
            iArr[i][0] = Integer.parseInt(sArr[0]);
            iArr[i][1] = Integer.parseInt(sArr[1]);
        }
        sorting(iArr);
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i][0]+" "+iArr[i][1]);
        }
    }
    static int[][] sorting(int[][] iArr){
        Arrays.sort(iArr, (o1, o2) -> {
            if(o1[0]==o2[0])
                return o1[1]-o2[1];
            return o1[0]-o2[0];
        });
        return iArr;
    }
}


```

## Code Review
comparator을 이용한 간단한 문제였다 매우매우 유용하다!

