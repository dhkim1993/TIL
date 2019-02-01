class Tv3{
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channerDown(){
        --channel;
    }
}
public class TvTest3 {
    public static void main(String[] args){
        Tv3 t1= new Tv3();
        Tv3 t2= new Tv3();
        System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+t2.channel + "입니다.");

        t2=t1;  //t2에 있던 인스턴스는 더이상 사용할수 없다 Garbage Collector 에 의해서 자동적으로 메모리에서 제거된다.

        t1.channel =7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+t2.channel + "입니다.");

    }
}
/*
t1의 channel값은 0입니다.
t2의 channel값은 0입니다.
t1의 channel값을 7로 변경하였습니다.
t1의 channel값은 7입니다.
t2의 channel값은 7입니다.

여러개의 참조변수가 하나의 인스턴스를 참조하는건 가능하지만 하나의 참조변수로 여러개의 인스턴스를 가르키는건 안된다.
 */