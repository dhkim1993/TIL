package Exercises_Package;

/**
 * Created by kimdonghyun on 23/09/2019.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedReaderTest {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        System.out.println(i+1);
    }
}