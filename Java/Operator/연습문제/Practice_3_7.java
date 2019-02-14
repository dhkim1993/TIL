/*
[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C = 5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오.
단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것 */

public class Practice_3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);
    }
}
/*
Fahrenheit:100
Celcius:37.78

[해설]

먼저 화씨를 섭씨로 바꾸는 공식은 '5/9f * (fahrenheit - 32)'이다. 5/9의 결과는 0이기 때문에 두 피연산자 중 어느 한 쪽을
 반드시 float나 double로 해야만 실수형태의 결과를 얻을 수 있다. 그래서 정수형 리터럴인 9대신 float타입의 리터럴인 9f를 사용하였다.
 소수점 셋째자리에서 반올림을 하려면 다음의 과정을 거쳐야한다.

1. 값에 100을 곱한다.
37.77778 * 100

2. 1의 결과에 0.5를 더한다.
3777.778 + 0.5 → 3778.278

3. 2의 결과를 int타입으로 변환한다.
(int)3778,278 → 3778

4. 3의 결과 100f로 나눈다.(100으로 나누면 소수점 아래의 값을 잃는다.)
3778 / 100f → 37.78

출처: https://yahma.tistory.com/143?category=668590 [목표가 생기면 무작정 달려들어야지. 실패를 두려워 할 여유같은 건 없을 때니까]
 */