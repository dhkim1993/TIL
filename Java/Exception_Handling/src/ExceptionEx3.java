public class ExceptionEx3 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");
            }   //try-catch의 끝.
        }
    }
}
/*
50
50
0           //ArithmeticException이 발생해서 출력됨. 예외처리를 했기 떄문에 여기서 종료되지않고 계속 for문실행.
12
100
16
11
11
12
100
 */