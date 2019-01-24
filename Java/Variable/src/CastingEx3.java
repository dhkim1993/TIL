public class CastingEx3 {
    public static void main(String[] args){

        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f= %20.18f\n", f);
        System.out.printf("d= %20.18f\n", d);
        System.out.printf("d2= %20.18f\n", d2);
    }
}
/*
f= 9.123456954956055000
d= 9.123456700000000000
d2= 9.123456954956055000    // f는 이미 저장할때 float로 저장을 했기떄문에 형변환을 해도 값은 달라지지않는다.
 */

