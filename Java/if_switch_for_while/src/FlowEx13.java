class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;	// 합계를 저장하기 위한 변수.

        for(int i=1; i <= 10; i++) {
            sum += i ;	//	sum = sum + i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    } // main의 끝
}
/*
1부터  1 까지의 합:  1
1부터  2 까지의 합:  3
1부터  3 까지의 합:  6
1부터  4 까지의 합: 10
1부터  5 까지의 합: 15
1부터  6 까지의 합: 21
1부터  7 까지의 합: 28
1부터  8 까지의 합: 36
1부터  9 까지의 합: 45
1부터 10 까지의 합: 55
 */