public class CastingEx4 {
    public static void main(String[] args){

        int i = 91234567;
        float f = (float)i; //float는 최대 7자리까지 정밀도 제공 따라서 8자리는 오류발생 int는 10자리 double은 15자리가능
        int i2 = (int)f;

        double d = (double)i;
        int i3 = (int)d;

        float f2= 1.666f;   //실수형을 정수형으로 형변환할때는 반올림 x
        int i4 = (int)f2;

        System.out.printf("i = %d\n", i);
        System.out.printf("f = %f i2=%d\n", f, i2);
        System.out.printf("d = %f i3=%d\n", d, i3);
        System.out.printf("(int)%f = %d\n",f2, i4);
    }
}
/*
i = 91234567
f = 91234568.000000 i2=91234568
d = 91234567.000000 i3=91234567
(int)1.666000 = 1
*/