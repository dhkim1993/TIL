class ArrayEx18 {
    public static void main(String[] args) {

        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;

        System.out.println(score.length);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
                System.out.println(tmp);
                System.out.println(i);
            }
        }

        System.out.println("sum=" + sum);
    }
}
/*
4
score[0][0]=100
score[0][1]=100
score[0][2]=100
score[1][0]=20
score[1][1]=20
score[1][2]=20
score[2][0]=30
score[2][1]=30
score[2][2]=30
score[3][0]=40
score[3][1]=40
score[3][2]=40
[I@7440e464
100
[I@7440e464
100
[I@7440e464
100
[I@49476842
20
[I@49476842
20
[I@49476842
20
[I@78308db1
30
[I@78308db1
30
[I@78308db1
30
[I@27c170f0
40
[I@27c170f0
40
[I@27c170f0
40
sum=570
 */
