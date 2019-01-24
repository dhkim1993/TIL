public class OperatorEx22 {
    public static void main(String[] args){

        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0 ==10.0f %b%n", 10.0==10.0f);
        System.out.printf("0.1 ==0.1f %b%n", 0.1==0.1f);
        System.out.printf("f=%19.17f%n", f);
        System.out.printf("d =%19.17f%n", d);
        System.out.printf("d2 =%19.17f%n", d2);
        System.out.printf("d==f %b%n", d==f);
        System.out.printf("d==d2 %b%n", d==d2);
        System.out.printf("d2==f %b%n", d2==f);
        System.out.printf("(float)d==f %b%n", (float)d==f);


    }
}
/*
10.0 ==10.0f true
0.1 ==0.1f false
f=0.10000000149011612
d =0.10000000000000000
d2 =0.10000000149011612
d==f false
d==d2 false
d2==f true
(float)d==f true

ex) float f = 0.1f 는 0.10000000149011612로 저장된다 float라 7자리 이후에 오차발생
    double d = 0.1 는 0.10000000000000001로 저장됨
    float를 double로 형변환해도 값은 달라지지않는다 빈자리에 0만 채울뿐
    그래서 f==d는 false이다.
    그래서 0.1 == 0.1f 도 false이다.
 */