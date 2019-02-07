class CallStackTest {
    public static void main(String[] args) {
        firstMethod();  //static 메소드는 객체 생성없이 호출이 가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}
/*
secondMethod()

 */