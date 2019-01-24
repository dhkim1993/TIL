public class FloatToBinEx {
    public static void main(String[] args){
        float f = -9.1234567f;
        int i = Float.floatToIntBits(f); // float 값을 int값으로 해석해서 반환

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i);
    }
}
/*
-9.123457
C111F9AE
문제집의 답과 실행값이 달라서 헷갈림...
 */