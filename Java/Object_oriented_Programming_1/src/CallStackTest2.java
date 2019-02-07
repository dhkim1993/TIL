public class CallStackTest2 {
    public static void main(String[] args) {

        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음.");
    }

    static void firstMethod() {
        System.out.println("firstMethod()가 시작됨.");
        secondMethod();
        System.out.println("firstMethod()가 종료됨.");
    }

    static void secondMethod() {
        System.out.println("secondMethod()가 시작");
        System.out.println("secondMethod()가 종료");
    }
}
/*
main(String[] args)이 시작되었음.
firstMethod()가 시작됨.
secondMethod()가 시작
secondMethod()가 종료
firstMethod()가 종료됨.
main(String[] args)이 끝났음.
프로그램이 실행됬을때 호출스택의 변화를 나타낸것이다.
 */
