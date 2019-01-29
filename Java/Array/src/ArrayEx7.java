public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int i, n;
        int tmp = 0;

        for (i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (i = 0; i < 100; i++) {
            n = (int) (Math.random() * 10); // 0~9 중 랜덤
            tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
/*
0123456789
3806495172
 */