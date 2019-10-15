/**
 * Created by kimdonghyun on 15/10/2019.
 */
public class MatrixPath_BU {

    int[][] iArr = new int[5][5];
    int[][] cost = {{9999,9999,9999,9999,9999},{9999,6,7,12,5},{9999,5,3,11,18},{9999,7,17,3,3},{9999,8,10,14,9}};
    public static void main(String[] args) {
        System.out.println(new MatrixPath_BU().mat());
    }
    int mat(){
        for (int i = 1; i <= iArr.length-1; i++) {
            for (int j = 1; j <= iArr.length-1; j++) {
                if(i==1 && j==1) iArr[i][j] = cost[1][1];
                else iArr[i][j] = cost[i][j] + Math.min(iArr[i-1][j], iArr[i][j-1]);
            }
        }
        return iArr[iArr.length-1][iArr.length-1];
    }
}
/*
0 0 0 0 0
0 6 13 25 30
0 11 14 25 43
0 18 31 28 31
0 26 36 42 40
 */