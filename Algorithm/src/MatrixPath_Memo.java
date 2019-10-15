/**
 * Created by kimdonghyun on 15/10/2019.
 */
public class MatrixPath_Memo {
    int[][] iArr = new int[5][5];
    int[][] cost = {{9999, 9999, 9999, 9999, 9999}, {9999, 6, 7, 12, 5}, {9999, 5, 3, 11, 18}, {9999, 7, 17, 3, 3}, {9999, 8, 10, 14, 9}};

    public static void main(String[] args) {
        System.out.println(new MatrixPath_Memo().mat(4, 4));
    }
    int mat(int i, int j) {
        if (iArr[i][j] != 0) return iArr[i][j];
        if (i == 1 && j == 1) iArr[i][j] = cost[i][j];
        else if (i == 1) iArr[i][j] = mat(1, j - 1) + cost[i][j];
        else if (j == 1) iArr[i][j] = mat(i - 1, 1) + cost[i][j];
        else iArr[i][j] = Math.min(mat(i - 1, j), mat(i, j - 1)) + cost[i][j];
        return iArr[i][j];
    }
}
/*
0 0 0 0 0
0 6 13 25 30
0 11 14 25 43
0 18 31 28 31
0 26 36 42 40
 */