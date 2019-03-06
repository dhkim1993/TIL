import java.util.Scanner;

public class Back_8741 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < k; i++) {
            sb.append(1);
        }
        for (int i = 0; i < k - 1; i++) {
            sb.append(0);
        }
        System.out.println(sb);
    }
}
/*
3 
11100
 */

