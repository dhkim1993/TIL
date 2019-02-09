public class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point_ {
    int x, y;

    Point_(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}

class Point3D extends Point_ {
    int z;

    Point3D(int x, int y, int z) {
        super(x,y);
        //this.x = x;
       // this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x:" + x + ",y:" + y + ", z:" + z;
    }

}
/*
this는 같은 클래스의 다른 생성자를 호출하는데 사용되지만 super()는 조상 클래스의 생성자를 호출하는데 사용된다.
생성자의 첫줄에서 조상클래스의 생성자를  호출해야한다. 자식클래스 맴버가 조상클래스 맴버를 사용할수도 있기떄문에 먼저 초기화가 되있어야하기떄문이다.
 */