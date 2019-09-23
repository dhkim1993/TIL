package Exercises_Package;

import java.util.Scanner;

public class Back_16676 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String N = input.nextLine();
        if (N.equals("0")) {
            System.out.println(1);
            System.exit(0);
        }
        String[] sArr = N.split("");
        String oneStr = "";
        for (int i = 0; i < sArr.length; i++) {
            oneStr += "1";
        }
        if (Integer.parseInt(N) < Integer.parseInt(oneStr)) {
            System.out.println(sArr.length - 1);
        } else {
            System.out.println(sArr.length);
        }
    }
}
