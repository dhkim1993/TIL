package Exercises_Package;


class Programmers_N으로표현 {
    static long solution(int n) {
        long a = 0;
        long b = 1;
        long c = a + b;

        for (int i = 0; i < n - 1; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c * 2 + b * 2;
    }
    public static void main(String[] args) {
        int n = 80;
        System.out.println(solution(n));
    }
}





