package Exercises_Package;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Back_17080_revise {
    static String solution(String s) {
        char[] alphabet = new char[26];
        String result = "";

        for (int i = 97; i <= 122; i++)
            alphabet[i - 97] = (char) i;
        for (int i = 0; i < alphabet.length; i++)
            result += Integer.toString(s.indexOf(alphabet[i])) + " ";

        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }
}
/*
BufferedReader 로 입력받으면 소요시간이 훨씬 단축된다. Scanner로 받을땐 100ms 였는데 바꾸고나니 70ms로 줄었다.
 */