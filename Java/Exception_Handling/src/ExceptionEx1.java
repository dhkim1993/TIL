public class ExceptionEx1 {
    public static void main(String[] args) {

        try {
            try {
            } catch (Exception e) { //catch 박스 안에 선언된 변수는 박스 안에서만 유효하다.
            }
        } catch (Exception e) {
            try {
            } catch (Exception e) { //위에 catch박스안에 e가 중첩되는건 안된다.
            }
        }

        try {
        } catch (Exception e) { //박스 안에서만 유효하기떄무에 이렇게 한가지로만 해도 된다.

        }
    }
}
