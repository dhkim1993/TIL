package Exercises_Package;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by kimdonghyun on 22/09/2019.
 */

/*
012, 021, 102 , 120, 201,
5
201
 */
public class line_20190922 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        for (int i = 0; i < n; i++) {
            s += Integer.toString(sc.nextInt());
        }

        int zeroCnt = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroCnt++;
            } else if (s.charAt(s.length() - 1) == 0) {
                zeroCnt = 0;
            } else {
                max = max < zeroCnt ? zeroCnt : max;
                zeroCnt = 0;
            }
        }
        if(max%2==1) System.out.println(max/2+1);
        else System.out.println(max/2);
        // 10001
    }
}
