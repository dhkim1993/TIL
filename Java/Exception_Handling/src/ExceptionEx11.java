public class ExceptionEx11 {
    public static void main(String[] args){

        throw new RuntimeException(); //RuntimeException 을 고의로 발생시킴
    }
}
/*
컴파일은 가능. 실행은 비정삭으로 종료.
RuntimeException은 프로그래머의 실수로 발생하는 오류이다. 그래서 예외처리를 강제하지 않는것.
컴파일러가 예외처리를 확인하지않는다. = unchecked예외
예외처리를 확인하는건 = checked예외 라고 부른다.
 */