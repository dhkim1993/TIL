public class ExceptionEx5 {
    public static void main(String[] args){

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);  //123찍고 다음에 오류가나서 try를 벗어난다. 발생한 예외에 해당하는 catch로 가서 실행한다.
        } catch (ArithmeticException ae) {
            System.out.println(5);
        }

        System.out.println(6);
    }
}
/*
1
2
3
5
6
 */