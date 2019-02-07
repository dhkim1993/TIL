class Data2 {
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);  //매개변수 d는 주소를 가지고있음.  그로인해 x값이 1000으로 바뀜. 그리고 소멸
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);  //참조형 매개변수 d로 인해 값이 변경이 되버렸으므로 그데로 1000
    }

    static void change(Data d) {    //참조형 매개변수는 값이 아닌 주소가 복사된다.
        d.x = 1000; //d는 주소를 가지고있음 main의 x의 주소를 가르키고 그 값을 변경.
        System.out.println("change() : x = " + d.x);
    }
}
/*
main() : x = 10
change() : x = 1000
After change(d)
main() : x = 1000
 */