# TIL - CodingTest Practice 
### 2019.10.08 Tue

## Programmers - 타겟넘버 (level 2)

n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.<br>

-1+1+1+1+1 = 3<br>
+1-1+1+1+1 = 3<br>
+1+1-1+1+1 = 3<br>
+1+1+1-1+1 = 3<br>
+1+1+1+1-1 = 3<br><br>
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.<br><br>

제한사항<br>
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.<br>
각 숫자는 1 이상 50 이하인 자연수입니다.<br>
타겟 넘버는 1 이상 1000 이하인 자연수입니다.<br><br>
입출력 예<br>

|numbers	|target	|return|
|---|---|---|
|[1, 1, 1, 1, 1]|	3	|5|

입출력 예 설명
문제에 나온 예와 같습니다.

```
/**
 * Created by kimdonghyun on 08/10/2019.
 */
public class TargetNumber {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(numbers,target,0);
        return answer;
    }
    public void DFS(int[] numbers, int target, int k) {
       if(k==numbers.length){
           int sum=0;
           for (int i : numbers) sum += i;
           if(sum==target)
               answer++;
           return;
       }else{
           numbers[k] *= 1;
           DFS(numbers,target,k+1);
           numbers[k] *= -1;
           DFS(numbers,target,k+1);
       }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        int target = 3;
        System.out.println(new TargetNumber().solution(arr, target));
    }
}
```

## Code Review
dfs 탐색을 한후 전부 경우의 수를 보고 target과 같으면 ++ 해서 리턴한다.

## 다른분들의 풀이

```
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}
```

