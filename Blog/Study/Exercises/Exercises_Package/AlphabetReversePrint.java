package Exercises_Package;


class AlphabetReversePrint {
    static String solution(String s) {
        String result = "";
        char[] cArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cArr[i] = s.charAt(i);
        }
        char[] A = new char[26];
        char[] a = new char[26];
        char[] AlphabetArr = new char[26];
        char[] alphabetArr = new char[26];
        int k = 0;
        int l = 0;
        for (int i = 65; i <= 90; i++) {
            A[k] = (char) i;
            a[k] = (char) (i + 32);
            k++;
        }
        for (int i = 90; i >= 65; i--) {
            AlphabetArr[l] = (char) i;
            alphabetArr[l] = (char) (i + 32);
            l++;
        }

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == ' ') {
                result += " ";
            }
            for (int j = 0; j < AlphabetArr.length; j++) {
                if (cArr[i] == A[j]) {
                    result += AlphabetArr[j];
                } else if (cArr[i] == a[j]) {
                    result += alphabetArr[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "I love you";
        System.out.println(solution(s));
    }
}
/*
R olev blf
 */




