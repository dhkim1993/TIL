/*
[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
 */
public class Practice_5_4 {
    public static void main(String[] args) {

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length+1; j++) {
                System.out.print(arr[i][j]+" ");
                total += arr[i][j];
                average++;
            }
            System.out.println();
        }
        average = total / average;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
/*
5 5 5 5 5
10 10 10 10 10
20 20 20 20 20
30 30 30 30 30
total=325
average=16.25
 */
