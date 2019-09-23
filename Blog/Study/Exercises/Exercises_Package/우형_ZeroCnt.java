package Exercises_Package;

class
우형_ZeroCnt {
    static int solution(int N) {
        String num = Integer.toBinaryString(N);
        System.out.println(num);
        int zeroCnt = 0, max = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                zeroCnt++;
            } else if (num.charAt(num.length() - 1) == 0) {
                zeroCnt = 0;
            } else {
                max = max < zeroCnt ? zeroCnt : max;
                zeroCnt = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(38760));
    }
}



