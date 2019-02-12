class A_ {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B_ implements I {
    public void play() {
        System.out.println("play in B class");
    }
}

class C_ implements I {
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A_ a = new A_();
        a.autoPlay(new B_());
        a.autoPlay(new C_());
    }
}
/*
play in B class
play in C class
 */