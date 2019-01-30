import java.util.*;

public class MultiArrEx2 {
    public static void main(String[] args) {

        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i + SIZE + j + 1;   // 0+5+0+1 =6
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }       //여기서 bingo={6,7,8,9,...}이였던 배열을 다 섞는다.

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]); //섞인배열 출력한번하고
                }
                System.out.println();           //5개씩 출력할때마다 줄바꿈해주고
            }

            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요 . (종료:0) : ", SIZE * SIZE);
            String tmp = scanner.nextLine();    //숫자를 문자열로 받은거
            num = Integer.parseInt(tmp);    //숫자로 바꿔서 num에저장

            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;    //입력한 숫자랑 섞인거중에 같으면 그걸 0으로 바꿔서 빙고를 만들어줄꺼임 그리고 for문탈출
                    }

                }
            }
        } while (num!=0);   //입력한게 0 이아니면 반복 do부터 다시 반복해서 0으로 빙고만들기
    }   //main의 끝
}
/*
 7  8 10 12  8
10 11  6 12 11
12 10 13  9  7
 9 13 11 11 14
 8  9  9 10 10

1~25의 숫자를 입력하세요 . (종료:0) : 14
 7  8 10 12  8
10 11  6 12 11
12 10 13  9  7
 9 13 11 11  0
 8  9  9 10 10

1~25의 숫자를 입력하세요 . (종료:0) : 11
 7  8 10 12  8
10  0  6 12 11
12 10 13  9  7
 9 13 11 11  0
 8  9  9 10 10

1~25의 숫자를 입력하세요 . (종료:0) : 22
 7  8 10 12  8
10  0  6 12 11
12 10 13  9  7
 9 13 11 11  0
 8  9  9 10 10

쭉쭉쭉..
 */