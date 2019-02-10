public class CastingTest1 {
    public static void main(String[] args){

        Car_ car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water();  car 참조변수로는 FireEngine 메소드 사용 불가
        fe2= (FireEngine)car;
        fe2.water();
    }
}

class Car_ {
    String color;
    int door;

    void drive(){

    }
    void stop(){

    }
}
class FireEngine extends Car_ {
    void water() {
        System.out.println("water!!");
    }
}
/*
water!!
water!!
참소변수의 형변환의 관한 예제이다. up-Casting, down-Casting
 */