class A{
    public void methodA(B b){
        b.methodB();
    }
}
class B{
    public void methodB() {
        System.out.println("methodB()");
    }
}

public class InterfaceTest {
    public static void main(String args[]){
        A a = new A();  //a에 A인스턴스 넣고
        a.methodA(new B()); //a.methodA(b인스턴스) -> A의     public void methodA(B b)실행 -> b.methodB(); ->
        // -> System.out.println("methodB()");
    }
}
/*
이처럼 인터페이스를 매개체로 두고 A가 B를 호출했다.
methodB()
 */