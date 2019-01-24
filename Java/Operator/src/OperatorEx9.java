public class OperatorEx9 {
    public static void main(String[] args){

        long a = 1000000 * 1000000;
        long b = 1000000 * 1000000L;

        System.out.println("a=" +a);
        System.out.println("b=" +b);
    }
}
/*
a=-727379968
b=1000000000000
a의 계산경우 int * int 라 값도  int 인데    int의 허용 범위인 10자리가 넘어서 오류발생
 */