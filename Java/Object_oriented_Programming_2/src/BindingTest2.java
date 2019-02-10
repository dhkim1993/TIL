public class BindingTest2 {
    public static void main(String[] args) {
        Parent___ p = new Child___();
        Child___ c = new Child___();

        System.out.println("p.x = " + p.x);
        ((Child___) p).method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent___ {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}
class Child___ extends Parent___{

}
/*
p.x = 100
Parent Method
c.x = 100
Parent Method
조상과 자식클래스에 중복된 정의가 없을시는 선택에 여지가 없이 정의된 조상클래스를 따라 싷행.
 */