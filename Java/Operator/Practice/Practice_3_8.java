//오류수정해서 출력과같이 수정해라
public class Practice_3_8 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        char ch = 'A';
        ch = (char)(ch + 2);
        float f = (3 / 2f);
        long l = 3000L * 3000 * 3000;
        float f2 = 0.1f;
        double d = 0.1f;
        boolean result = d == f2;

        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);
    }
}
/*
c=30
ch=C
f=1.5
l=27_000_000_000
result=true
 */



