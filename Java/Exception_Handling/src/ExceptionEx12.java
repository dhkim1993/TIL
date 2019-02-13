public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {

        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
/*
Exception in thread "main" java.lang.Exception
	at ExceptionEx12.method2(ExceptionEx12.java:12)
	at ExceptionEx12.method1(ExceptionEx12.java:8)
	at ExceptionEx12.main(ExceptionEx12.java:4)
 */

