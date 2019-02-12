class Outer_ {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

class InnerEx4 {
    public static void main(String[] args) {
        // 인스턴스클래스의 인스턴스를 생성하려면
        // 외부 클래스의 인스턴스를 먼저 생성해야 한다.
        Outer_ oc = new Outer_();
        Outer_.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer_.StaticInner.cv : " + Outer_.StaticInner.cv);

        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer_.StaticInner si = new Outer_.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}
/*
ii.iv : 100
Outer_.StaticInner.cv : 300
si.iv : 200
 */