# TIL - CodingTest Practice 
### 2019.10.10 Thu

## Programmers - 숫자의 표현 (level 2)

숫자의 표현<br>
Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.<br>

1 + 2 + 3 + 4 + 5 = 15<br>
4 + 5 + 6 = 15<br>
7 + 8 = 15<br>
15 = 15<br><br>
자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.<br><br>

제한사항<br>
n은 10,000 이하의 자연수 입니다.<br><br>
입출력 예<br>

|n	|result|
|---|---|
|1|5	4|


```
class Solution {
  public int solution(int n) {
      int sum =0, cnt =0;

      for(int i = 1; i<=n/2+1; i++){
          int j = i;
          sum =0;
          while(sum < n){
              sum += j++;
              if(sum == n) {
                  cnt++;
                  break;
              }
          }
      }
      return cnt+1;
  }
}
```

## Code Review 
for문 범위를 n/2+1 로 잡고 ex) 15/2+1 =8 따라서 7+8 15 이기떄문에 더 갈 필요가 없음.<br>
그리고 for문의 i 증가로 1부터 더하고 2부터 더하고 3부터 더하고 이런식으로 계산하면 답나온다. <br>
자기자신 포함이기떄문에 +1해서 return한다.<br>
근데 다른분의 코드가 충격적이다

## 충격적인 다른분 코드

```
public class Expressions {

    public int expressions(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i += 2) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Expressions expressions = new Expressions();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(expressions.expressions(15));
    }
}
```

“주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다.”

라는 댓글이 있다..