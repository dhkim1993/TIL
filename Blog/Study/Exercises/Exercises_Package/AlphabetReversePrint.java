package Exercises_Package;


class AlphabetReversePrint {
    /*static String solution(String s) {
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
    }*/

    private static String solution2(String str){

        char[]A = new char[26];
        char[]a = new char[26];
        String result="";
        for (int i = 26; i >=0; i--) {
            A[i] = (char)(65+i);
            a[i] = (char)(97+i);
            System.out.println(A[i] +" "+ a[i]);
        }
        char[] cArr = str.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            if(cArr[i] == ' '){ continue;}
            if('A'<=cArr[i] && cArr[i] >= 'Z'){
                result+=A[cArr[i]-65];
            }else if('a'<=cArr[i] && cArr[i] >= 'z'){
                result+=a[cArr[i]-97];
            }
        }
        System.out.println(result);
        return result;
    }
    //A(65) -> Z(90) a(97) -> z(122) +25
    //B(66) -> Y(89) b(98) -> y(121) +23
    public static void main(String[] args) {
        String str = "I love you";
        System.out.println(solution2(str));
    }
}
/*
R olev blf
 */




