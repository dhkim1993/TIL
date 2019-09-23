package Exercises_Package;

import java.util.*;

public class Back_apmt {
    //“a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”
    //단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
    //k,n 은 1~14 k층 n호에 몇명사는지 구해라
    // 3층 1,
    // 2층 1,4,10,20,35,56
    // 1층 1,3,6,10,15,21,28,36,45
    // 0층 1,2,3,4,5,6,7,8,9,10,11,12,13,14
    public static void main(String[] args) {

        int[][] arr = new int[15][15];          //0,0 은 헷갈려서 안쓸려고 15크기 2차원배열생성

        for (int i = 1; i <= 14; i++) {     //일단 0층을 i호수만큼 인원수로 세팅
            arr[0][i] = i;
            // System.out.print(arr[0][i] + " ");
        }

        for (int a = 1; a <= 14; a++) { //a는 층수
            //System.out.println();
            for (int b = 1; b <= 14; b++) { //b는 호수
                int sum = 0;
                for (int i = 1; i <= b; i++) {  //호수만큼 사람들을 sum에 더해서 배열에 저장.
                    sum += arr[a - 1][i];
                }
                arr[a][b] = sum;
                //System.out.print(arr[a][b] + " ");
            }
        }
        Scanner input = new Scanner(System.in);     //테스트케이스 숫자랑 값 배열에 저장해서 출력.
        int T = input.nextInt();
        int t = 0;
        int[] result = new int[T];

        for (t = 0; t < T; t++) {
            int k = input.nextInt();
            int n = input.nextInt();
            result[t] = arr[k][n];
        }
        for (t = 0; t < T; t++)
            System.out.println(result[t]);
    }
}

