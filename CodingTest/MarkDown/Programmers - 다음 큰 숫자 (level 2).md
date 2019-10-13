# TIL - CodingTest Practice 
### 2019.10.13 Sun

## Programmers - 다음 큰 숫자 (level 2)

다음 큰 숫자<br>
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.<br>

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.<br>
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.<br>
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.<br>
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.<br>

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.<br>

제한 사항<br>
n은 1,000,000 이하의 자연수 입니다.<br>
입출력 예<br>

|n	|result|
|---|---|
|78	|83|
|15	|23|

입출력 예#2<br>
15(1111)의 다음 큰 숫자는 23(10111)입니다.


```
class Solution {
  public int solution(int n) {
      String s =Integer.toBinaryString(n);
      int oneCnt=0;
      for(int i =0; i<s.length(); i++) 
          if(s.charAt(i)=='1') oneCnt++;
      String target="";
      while(true){
          n += 1;
          target = Integer.toBinaryString(n).replace("0","");
          if(target.length() == oneCnt) break;
      }
      return n;
  }
}
```

## Code Review

1. n을 2진수 String 으로 바꿔주고 0 을 없앤후에 1의 갯수를 구함.
2. n+1 부터 1번과정을 반복해서 갯수가 같으면 return 


## 다른 분들의 코드

```
public int nextBigNumber(int n)
    {
      int a = Integer.bitCount(n);
      int compare = n+1;

      while(true) {
        if(Integer.bitCount(compare)==a)
          break;
        compare++;
      }

      return compare;
    }

    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
```

# Integer.bitCount 
처음봤다. 2진수로 바꾸고 1의 갯수를 세어주는 메소드이다.....
