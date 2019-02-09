public class PointTest2 {
    public static void main(String args[]) {

        Point3D_ p3 = new Point3D_();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point2 {
    int x = 10;
    int y = 20;

    Point2(int x, int y) {  //컴파일러는 자동으로 Point2 생성자의 첫줄에 super()을 추가한다.
        this.x = x;
        this.y = y;
    }
}

class Point3D_ extends Point2 {
    int z = 30;

    Point3D_() {
        this(100, 200, 300);
    }   //밑에있는 생성자 호출함 값을 대입.

    Point3D_(int x, int y, int z) {
        super(x, y);    //Point2클라스 생성자 호출해서 x,y,z값을 바꿈
        this.z = z;
    }
}
/*
p3.x=100
p3.y=200
p3.z=300
Point3D_ 클래스의 인스턴스를 생성할때 순서는 이렇다.
Point3D_() -> Point3D_(int x, int y, int z) -> Point(int x, int y) -> Object()
 */