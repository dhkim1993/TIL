/**
 * Created by kimdonghyun on 15/10/2019.
 */
public class Fibo_Memo {
    int[] iArr = new int[100];
    public static void main(String[] args) {
        System.out.println(new Fibo_Memo().fib(30));
    }

    int fib(int n) {
        if (n == 1 || n == 2) return 1;
        else if (iArr[n] != 0) return iArr[n];
        return iArr[n] = fib(n - 2) + fib(n - 1);
    }
}
