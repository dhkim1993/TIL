package Exercises_Package;

import java.util.Scanner;

public class Backjoon_17080 {
    static String solution(String s) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result="";

        for (int i = 0; i < alphabet.length; i++) {
            result += Integer.toString(s.indexOf(alphabet[i])) + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(solution(s));
    }
}


