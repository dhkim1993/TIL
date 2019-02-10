public class InstanceofTest {
    public static void main(String args[]){
        FireEngine_ fe = new FireEngine_();

        if(fe instanceof FireEngine_){
            System.out.println("This is a FireEngine instance.");
        }
        if(fe instanceof Car__){
            System.out.println("This is a Car_ instance.");
        }
        if(fe instanceof Object){
            System.out.println("This is a Object instance.");
        }
        System.out.println(fe.getClass().getName());    //참조변수가 가르키고 있는 인스턴스 클래스 이름을 문자열로 반환한다.
    }
}
class Car__{}
class FireEngine_ extends Car__{}
/*
This is a FireEngine instance.
This is a Car_ instance.
This is a Object instance.
FireEngine_
if값이 true이면 다른 if문의 타입으로 형변환해도 상관없다는걸 보여주는 예제이다.
 */