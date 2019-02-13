public class ExceptionEx7 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)  // 차례차례 조건과 맞는 catch를 찾는데 여기서 찾았기떄문에 다음꺼는 실행안함.
                System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }   //try-catch의 끝.
        System.out.println(6);
    }
}
/*
1
2
3
ArithmeticException
6
 */
