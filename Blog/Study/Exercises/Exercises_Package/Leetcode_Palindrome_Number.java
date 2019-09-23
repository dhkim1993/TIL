package Exercises_Package;

import java.util.Stack;

public class Leetcode_Palindrome_Number {
    public static void main(String[] args) {
        int x = 121;
        if (x < 0) {
            System.exit(0);
        }
        Stack stack = new Stack();
        String s = Integer.toString(x);
        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length; i++) {
            stack.push(sArr[i]);
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += (String) stack.pop();
        }
        System.out.println(result);
        if (result.equals(Integer.toString(x))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

