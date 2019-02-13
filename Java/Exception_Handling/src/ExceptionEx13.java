public class ExceptionEx13 {
    public static void main(String[] args) {

        method1();  //같은 클래스내의 static맴버 이므로 객채 없이 호출가능
    }

    static void method1() {
        try {
            throw new Exception(); // 밑에 두줄 합힌거랑 같음
            /*  Exception e = new Exception();
                throw e; */
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다. ");
            e.printStackTrace();
        }
    }
}
/*
java.lang.Exception
	at ExceptionEx13.method1(ExceptionEx13.java:9)
	at ExceptionEx13.main(ExceptionEx13.java:4)
method1 메서드에서 예외가 처리되었습니다.

예외가 method1()에서 발생했고 main메서드가 method1()를 호출했다.

 */