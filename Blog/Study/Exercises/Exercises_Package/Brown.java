package Exercises_Package;

import java.util.Stack;

class Brown {
    public static void main(String[] args) {
        String A = "browoanoommnaon"; // zyelleyz
        solution(A);
    }

    public static String[] reverse(String[] A) {
        String[] result = new String[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            result[(A.length - i) - 1] = A[i];
        }
        return result;
    }

    public static void solution(String A) {
        String[] reverseFormatString = reverse(A.split(""));
        Stack stack = new Stack();
        for (String str : reverseFormatString) {
            if (!stack.empty() && str.equals(stack.peek())) {
                stack.pop();
                continue;
            }
            stack.push(str);
        }
        while (!stack.empty()) {
            String val = (String) stack.pop();
            System.out.print(val);
        }
    }
       /* Stack<String> st = new Stack<>();
        String str = "";

        for (int i = 1; i < s.length(); i++) {
            if (i == s.length() - 1 && !(s.charAt(i) == (s.charAt(i - 1)))) {
                str += s.charAt(i);
            }
            if (!(s.charAt(i - 1) == s.charAt(i))) {
                str += s.charAt(i - 1);
            } else {
                i++;
            }
        }
        System.out.println(str);
        return str;*/

}


    /*public static void main(String[] args) {
        String s = "browoanoommnaon";
        System.out.println(solution(s));

    }*/





