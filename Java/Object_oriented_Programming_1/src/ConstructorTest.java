class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) {  //매개변수가 있는 생성자
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        //Data_2 d2 = new Data_2();
    }
}
/*
Data_2 d2 = new Data_2(); 여기서 컴파일 에러발생 Data_1에는 아무 생성자가 없어서 default생성자가 자동으로
생기지만 위에 오류는 매개면수가 1개 있는 생성자가 존재하므로 기본 생성자를 따로 추가 해줘야한다.
아무 생성자도 없을때 컴파일러는 자동으로 추가해준다 하지만 그 외 다른 생성자가 있을시 컴파일 오류발생.
 */
