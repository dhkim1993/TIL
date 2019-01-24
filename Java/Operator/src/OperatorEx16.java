public class OperatorEx16 {
    public static void main(String[] args){

        float pi = 3.141592f;
        float shortPi = (int)(pi *1000) / 1000f;
        /*
        pi * 1000 는 pi가 실수이므로 값은 실수가된다. float * int = float
        3141.592f가 되고 int로 형변환하면 3141
        그리고 나누기 1000f 결과는 float 이므로 3.141
         */
        System.out.println(shortPi);
    }
}
/*
3.141
 */