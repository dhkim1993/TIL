import java.util.Scanner;

/**
 * Created by kimdonghyun on 16/10/2019.
 */
public class Baek_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = 0;
        int[] iArr = new int[11];
        iArr[0] = 0;
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 4;
        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            for (int j = 4; j <= n; j++) {
                iArr[j] = iArr[j-1]+iArr[j-2]+iArr[j-3];
            }
            System.out.println(iArr[n]);
        }
    }
}
