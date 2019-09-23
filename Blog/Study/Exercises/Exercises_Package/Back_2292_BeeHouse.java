package Exercises_Package;

import java.util.Scanner;

public class Back_2292_BeeHouse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int room = 1;
        int i = 1;
        int increaseNum = 0;
        if(N==1){
            System.out.println(room);
        }
        while (i <= N) {
            room++;
            increaseNum += 6;
            i += increaseNum;
        }
        System.out.println(room);
    }
}

/*      index1=1
        +6
        index2= 2,3,4,5,6,7
        +12
        intdex3= 8~19
        +18
        index4= 20~37
        +24
        index5= 38~61
        +30
        index6= 62~91
*/





