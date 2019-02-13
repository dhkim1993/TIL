public class ExceptionEx8 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace(); //예외발생 당시의 호출스택에 있었던 메소드의 정보와 예외 메세지를 화면에 출력한다.
            System.out.println("예외메세지 : " + ae.getMessage()); // 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.
        }   //try-catch의 끝.
        System.out.println(6);
    }
}
/*
1
2
3
java.lang.ArithmeticException: / by zero
	at ExceptionEx8.main(ExceptionEx8.java:8)
예외메세지 : / by zero
6
 */