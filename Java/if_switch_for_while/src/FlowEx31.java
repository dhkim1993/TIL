class FlowEx31 {
    public static void main(String[] args) {
        int i;

        for(i=0;i <= 10;i++) {
            if (i%3==0)
                continue;           // 밑에 무시하고 반복문 위로 올라감
            System.out.println(i);
        }
    }
}
/*
1
2
4
5
7
8
10
 */