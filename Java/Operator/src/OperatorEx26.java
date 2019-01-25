public class OperatorEx26 {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a = %d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a = %d, b=%d%n", a, b);
    }
}
/*
a = 5, b=0
a!=0 || ++b!=0 = true       여기서 ||는 or이며 or은 앞에 조건이 참이면 뒤에조건은 실행조차 안한다. 그래서 b는 그대로 0
a = 5, b=0
a==0 && ++b!=0 = false      앞에 조건이 거짓이므로 뒤에꺼 하지도않는다.
a = 5, b=0

 */