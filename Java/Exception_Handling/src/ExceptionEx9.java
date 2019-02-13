public class ExceptionEx9 {
    public static void main(String args[]) {

        try {
            Exception e = new Exception("고의로 발생시켰지롱~");
            throw e; //예외발생시킴
            // throw new Exception("고의로 발생시켰지롱~"); 위에 두줄을 이렇게 한줄로 가능.
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료됨");
    }
}
/*
에러 메세지 : 고의로 발생시켰지롱~
프로그램이 정상 종료됨
java.lang.Exception: 고의로 발생시켰지롱~
	at ExceptionEx9.main(ExceptionEx9.java:5)
 */