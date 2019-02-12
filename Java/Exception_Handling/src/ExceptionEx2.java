public class ExceptionEx2 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10);
            System.out.println(result);
        }
    }
}
/*
20
100
25
100
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionEx2.main(ExceptionEx2.java:8)
	ArithmeticException 는 산술과정에서 오류가 있을때 발생하는 예외
 */