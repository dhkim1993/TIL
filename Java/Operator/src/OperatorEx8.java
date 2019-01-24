public class OperatorEx8 {
    public static void main(String[] args){

        int a= 1000000;
        int b= 2000000;

        long c = a * b;

        System.out.println(c);

    }
}
/*
-1454759936
long은 8바이트라 충분히 정상적인 값이 출력될꺼 같지만
int * int  = int   이기떄문에 오류값이 나온다.
올바르게 계산하려면 (long)a * b  로 해야한다.
 */