/**
 * Created by kimdonghyun on 15/10/2019.
 */
public class Fibo_BU {
    int[] iArr = new int[100];
    public static void main(String[] args) {
        System.out.println(new Fibo_BU().fib(10));
    }
    int fib(int n){
        iArr[1] = iArr[2] = 1;
        for (int i = 3; i <=n; i++)
            iArr[i] = iArr[i-1] + iArr[i-2];
        return iArr[n];
    }
}
