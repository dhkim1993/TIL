/*
[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프 로그램을 작성하시오.
 */
public class Practice_4_6 {
    public static void main(String[] args) {

        int rullet1[] = {1, 2, 3, 4, 5, 6}, rullet2[] = {1, 2, 3, 4, 5, 6};
        int cnt = 0;
        for (int i = 0; i < rullet1.length; i++) {
            for (int j = 0; j < rullet2.length; j++) {
                if (rullet1[i] + rullet2[j] == 6) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
