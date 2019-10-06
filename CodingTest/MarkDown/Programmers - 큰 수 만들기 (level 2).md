# TIL - CodingTest Practice 
### 2019.10.05 Sat

## Programmers - 큰 수 만들기 (level 2)
큰 수 만들기<br>
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.<br>

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.<br>

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. <br>number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.<br>

제한 조건<br>
number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.<br>
k는 1 이상 number의 자릿수 미만인 자연수입니다.<br>
입출력 예<br>

|number|	k	|return|
|---|---|---|
|1924	|2	|94|
|1231234|	3	|3234|
|4177252841	|4	|775841|

```

/**
 * Created by kimdonghyun on 04/10/2019.
 */
public class MakeMax {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        System.out.println(new MakeMax().solution(number, k));
    }
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        char max;
        for (int i = 0; i < number.length() - k; i++) {
            max = '0';
            for (int j = idx; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}

```

## Code Review
k만큼 숫자를 삭제한 결과값을 구하기때문에 number.length() - k 만큼 for문 돌리고, <br> 
k길이 만큼 for문을 돌리면서 max값을 찾아서 StringBuilder로 붙여서 결과값을 리턴한다. <br>
시간 떄문에 Builder를 썼고 두번째 for문에서 비교하는 범위를 잘 생각하면 된다.<br>
이런식으로 비교됨.<br>
4 1 7 7 2 <br>
7 2 5 <br>
2 5 2 <br>
2 8 <br>
4 <br>
1 <br>
