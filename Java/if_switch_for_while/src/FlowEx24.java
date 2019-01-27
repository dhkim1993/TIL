class FlowEx24 {
    public static void main(String[] args) {

        int i=11, j;

        System.out.println("자, 이제 카운트다운을 시작합니다.");

        while(i--!=0) {
            System.out.println(i);

            for(j=0; j<1_000_000_000; j++) {

            }
        }

        System.out.println("GAME OVER");
    }
}
/*
자, 이제 카운트다운을 시작합니다.
10
9
8
7
6
5
4
3
2
1
0
GAME OVER
 */