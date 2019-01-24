public class OperatorEx18 {
    public static void main(String[] args){

        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;

        System.out.println(shortPi);
    }
}
/*
3142
Math.round 함수는 매개변수 소수점 첫번째 자리에서 반올림하고 정수로 돌려주는 함수이다.
 */