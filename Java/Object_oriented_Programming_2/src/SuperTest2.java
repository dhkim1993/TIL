public class SuperTest2 {
    public static void main(String args[]) {
        Child_ c = new Child_();
        c.method();
    }
}

class Parent_ {
    int x = 10;
}

class Child_ extends Parent {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
/*
x=20
this.x=20
super.x=10
 */