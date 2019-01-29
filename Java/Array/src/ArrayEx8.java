// 로또번호생성해보기
public class ArrayEx8 {
    public static void main(String[] args) {

        int i;
        int[] ball = new int[45];

        for (i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int temp = 0;
        int j = 0;

        for (i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45); // 0~ 44
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
/*
ball[0] = 21
ball[1] = 41
ball[2] = 42
ball[3] = 15
ball[4] = 14
ball[5] = 8
 */