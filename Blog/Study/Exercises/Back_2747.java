import java.util.*;

public class Back_2747 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int c = a + b;

        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            if (i == (n - 1)) {
                System.out.println(a);
            }
        }
    }
}
/*
10
55

 */
