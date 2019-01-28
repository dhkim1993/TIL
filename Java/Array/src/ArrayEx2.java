import java.util.*;  // Arrays.toString()을 사용하기 위해 추가

class ArrayEx2 {
    public static void main(String[] args) {

        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
/*
Arrays.toString() 함수는 배열을 System.out.println 으로 바로 출력하기 위한 함수이다.
배열을 바로 출력하면 밑에 값처럼 오류가 난다.
1,2,3,4,5,6,7,8,9,10,
[7, 8, 6, 3, 3, 7, 9, 5, 2, 6]
[100, 95, 80, 70, 60]
[a, b, c, d]
[I@511d50c0
abcd
 */