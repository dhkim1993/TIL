public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1(); // static메소드이므로 인스턴스없이 호출가능~
        System.out.println("method1()의 수행을 마치고 main으로 컴백");
    }

    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return; //현재 실행중인 메서드 종료~
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 fianlly블럭이 실행되었습니다.");
        }
    }
}
/*
return이 실행되는 중에도 fianlly는 실행하고 종료한다.
method1()이 호출되었습니다.
method1()의 fianlly블럭이 실행되었습니다.
method1()의 수행을 마치고 main으로 컴백
 */