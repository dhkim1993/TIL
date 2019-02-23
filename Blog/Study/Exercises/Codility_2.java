import java.util.*;

public class Codility_2 {
    public static void main(String[] args) {

        int[] A = {3, 8, 9, 7, 6};
        int k = 3;

        int tmp = 0;
        int tmp2 = 0;
//{3, 8, 9, 7, 6};
        for (int i = 0; i < k; i++) {
            tmp2 = A[A.length - 1];
            for (int j = A.length - 1; j >= 1; j--) {
                A[j] = A[j - 1];
            }
            A[0] = tmp2;
        }
        for(int i=0; i<A.length; i++)
            System.out.print(A[i]+" ");
    }
}
/*
고딜리티 프로그램이다.
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        int tmp=0;

        for (int i = 0; i < K; i++) {
            tmp = A[A.length - 1];
            for (int j = A.length - 1; j >= 1; j--) {
                A[j] = A[j - 1];
            }
            A[0] = tmp;
        }
        return A;
    }
}
*/
