public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
        // c.NUMBER =5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

class Card2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card2() {
        this("HEART", 1);   //위에 생성자 호출
    }

    public String toString() {      //값들을 붙여서 문자열로 반환
        return KIND + " " + NUMBER;
    }
}
/*
HEART
10
HEART 10
 */