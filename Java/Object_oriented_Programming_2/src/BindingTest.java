public class BindingTest {
    public static void main(String[] args) {
        Parent__ p = new Child__();
        Child__ c = new Child__();

        System.out.println("p.x = " + p.x);
        ((Child__) p).method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent__ {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child__ extends Parent__ {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}
/*
p.x = 100
Child Method
c.x = 200
Child Method
현재 p,c 둘다 Child__를 참조하고있다. 그리고 중복된 맴버 변수와 메소드가 있다. 두가지로 설명할수있다.
첫째는 맴버 사용 차이이다. 맴버사용은 참조변수 타입에 따라 달라진다.
두번쨰는 메소드인데 메소드는 참조변수 타입과 관계없이 실제 인스턴스의 타입을 따라 사용된다.
 */