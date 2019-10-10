# TIL - CodingTest Practice 
### 2019.10.09 Wen

## Programmers - 올바른 괄호 (level 2)

```
/**
 * Created by kimdonghyun on 09/10/2019.
 */
import java.util.Stack;

public class PerfectParenthesis_2 {
    public static void main(String[] args) {
        String s = "()(";
        System.out.println(new PerfectParenthesis_2().solution(s));
    }
    public boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push('(');
            }else{
                if(!stack.isEmpty()) stack.pop();
                else return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}

```

## Code Review
보자마자 스택이 떠올라서 ( 면 집어넣고 ) 이면 뺴면되겠네 해서 돌렸더니 시간초과가 나왔다.<br>
그래서 다시 시간들어갈만한거 최대한 없애고 해보니 됬다.
다른분들 풀이중에 스택을 안쓰고 한분들도 있었다.

## 다른분의 풀이

```
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
```
)일때 -- 를해서 음수가 되면 for문을 멈추고 false를 리턴하는게 기발하다. 배워야겠다