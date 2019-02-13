public class ExceptionEx14 {
    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        throw new Exception();
    }

}
/*
java.lang.Exception
	at ExceptionEx14.method1(ExceptionEx14.java:13)
	at ExceptionEx14.main(ExceptionEx14.java:5)
main 메서드에서 예외가 처리되었습니다.
method1()에서 예외를 발생시켜 main으로 넘겨주고 main에서 try-catch로 처리하는 예제이다.
 */