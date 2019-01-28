import java.util.*;
public class ToString_Ex {
    public static void main(String[] args){

        int[] iArray1 = new int[10];
        int[] iArray2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArray3 = {100, 95, 80, 70, 60};
        char[] chArray = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArray1.length; i++) {
            iArray1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i = 0; i < iArray2.length; i++) {
            iArray2[i] = (int) (Math.random() * 10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for (int i = 0; i < iArray1.length; i++) {
            System.out.print(iArray1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArray2));
        System.out.println(Arrays.toString(iArray3));
        System.out.println(Arrays.toString(chArray));
        System.out.println(iArray3);
        System.out.println(chArray);
    }
}
/*
Arrays.toString() 함수는 배열을 System.out.println 으로 바로 출력하기 위한 함수이다.
배열을 바로 출력하면 밑에 값처럼 오류가 난다.
1,2,3,4,5,6,7,8,9,10,
[9, 4, 2, 2, 1, 3, 1, 9, 3, 1]
[100, 95, 80, 70, 60]
[a, b, c, d]
[I@511d50c0
abcd

 */