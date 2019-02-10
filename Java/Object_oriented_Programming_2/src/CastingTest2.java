public class CastingTest2 {
    public static void main(String args[]){

        Car_ car = new FireEngine(); // Car_ car = new Car_(); 를 바꾼것이다.
        Car_ car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;
        fe.drive();
        car2 = fe;
        ((FireEngine) car2).drive();
    }
}
/*
서로 상속관계에 있는 타빙간의 형변환은 양방향으로 자유롭게 수행될 수 있으나
참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지 않는다.
그래서 참조변수가 가르키는 인스턴스의 타입이 무엇인지 확인하는것이 중요하다.
 */
