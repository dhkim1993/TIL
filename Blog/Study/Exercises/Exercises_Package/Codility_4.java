package Exercises_Package;

import java.util.ArrayList;

public class Codility_4 {
    public static void main(String[] args) {

        int A[] = {7, 4, 2, 8, 9, 2, 80, 2, 67};
        int min = 0;

        ArrayList<Integer> result = new ArrayList<>();

        for (int P = 1; P < A.length; P++) {
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;
            for (int i = 0; i <= P - 1; i++) {
                sum1 += A[i];
            }
            System.out.print(sum1 + " ");
            for (int i = P; i < A.length; i++) {
                sum2 += A[i];
            }
            System.out.print(sum2 + " ");
            sum3 = sum1 - sum2;

            if (sum3 < 0) {
                sum3 = sum3 * -1;
            }
            result.add(sum3);
            System.out.println(result.get(P - 1));
        }
        min = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) < min)
                min = result.get(i);
        }
        System.out.println(min);
    }
}

