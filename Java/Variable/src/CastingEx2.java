public class CastingEx2 {
    public static void main(String[] args){

        int i =10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);

        b = 10;
        i = (int)b;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);

        b = -2;
        i = (int)b;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i,b);

        System.out.printf("i=" +Integer.toBinaryString(i)); // 10진정수를 2진 정수로변환한 문자열로
    }
}
/*
[int -> byte] i=10 -> b=10
[int -> byte] i=300 -> b=44
int는 4 byte=32bit 이다. byte 는 8bit이다. 나머지 24bit이 날라가기떄문에 값손실 발생
00000000_00000000_00000001_00101100 = 300
                          _00101100 = 44

[int -> byte] i=10 -> b=10
[int -> byte] i=-2 -> b=-2
i=11111111111111111111111111111110
 */