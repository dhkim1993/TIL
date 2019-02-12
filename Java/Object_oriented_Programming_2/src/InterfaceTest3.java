public class InterfaceTest3 {
    public static void main(String[] args){
        A2 a = new A2();
        a.methodA2();
    }
}

class A2 {
    void methodA2() {
        I_ i = InstanceManager.getInstance();
        i.methodB2();
        System.out.println(i.toString());
    }
}

interface I_ {
    public abstract void methodB2();
}

class B2 implements I_ {
    public void methodB2() {
        System.out.println("methodB2 in B2 class");
    }

    public String toString() {
        return "class B2";
    }
}

class InstanceManager {
    public static I_ getInstance() {
        return new B2();
    }
}
/*
methodB2 in B2 class
class B2
 */