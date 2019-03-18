package Exercises_Package;


class ClapCnt369 {
    static int solution(int n) {
        String s = "";
        String[] sArr;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            s = Integer.toString(i);
            sArr = s.split("");
            for (int j = 0; j < sArr.length; j++) {
                if (sArr[j].equals("3") || sArr[j].equals("6") || sArr[j].equals("9")) {
                    cnt++;
                }
                sArr[j] = "";
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 33;
        System.out.println(solution(n));
    }
}



