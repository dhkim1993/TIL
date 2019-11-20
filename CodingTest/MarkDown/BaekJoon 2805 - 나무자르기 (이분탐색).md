# TIL - CodingTest Practice 
### 2019.11.08 Fri

## BaekJoon 2805 - 나무자르기 (이분탐색)

<img width="1168" alt="스크린샷 2019-11-08 오후 5 04 10" src="https://user-images.githubusercontent.com/46931527/68459880-dc4b1e00-0249-11ea-9b7f-14f422b8611d.png">
<img width="1168" alt="스크린샷 2019-11-08 오후 5 03 54" src="https://user-images.githubusercontent.com/46931527/68459883-dce3b480-0249-11ea-8ea6-0cdfbc088e8d.png">


```java
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kimdonghyun on 08/11/2019.
 */
public class Baek_2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        arr = sc.nextLine().split(" ");
        int[] trees = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n,m,trees));
    }
    static long solution(int n, int m, int[] trees){
        Arrays.sort(trees);
        long max = trees[trees.length-1];
        long min = 0;
        long mid = 0;

        while (max >= min){
            long cutTree =0;
            mid = (max+min)/2;
            for (int i = 0; i < trees.length; i++) {
                if(trees[i]>=mid)
                    cutTree += trees[i]-mid;
            }
            if(cutTree >= m) min = mid+1;
            else max = mid-1;
        }
        return max;
    }
}

```

## Code Review

1654와 거의 흡사한 문제이다. 톱날의 위치에 따라 일직선으로 쭉 나무를 자르기 때문에 톱날의 위치보다 작은 나무는 잘리지 않는다 

```java
if(trees[i]>=mid)
	cutTree += trees[i]-mid;
```
이 조건으로 잘린만큼의 나무길이를 cutTree에 담아서 if문으로 비교하여 이분탐색을 진행하면된다.

