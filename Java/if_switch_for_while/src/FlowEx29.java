class FlowEx29 {
    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 100; i++) {
            System.out.print("i="+i+" ");

            int tmp = i;

            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) // tmp%10이 3의 배수인지 확인(0 제외)
                    System.out.print("짝");
            } while ((tmp /= 10) != 0);  // tmp /= 10은 tmp = tmp / 10과 동일

            System.out.println();
        }
    } // main
}
/*
i=1
i=2
i=3 짝
i=4
i=5
i=6 짝
i=7
i=8
i=9 짝
i=10
i=11
i=12
i=13 짝
i=14
i=15
i=16 짝
i=17
i=18
i=19 짝
i=20
i=21
i=22
i=23 짝
i=24
i=25
i=26 짝
i=27
i=28
i=29 짝
i=30 짝
i=31 짝
i=32 짝
i=33 짝짝
i=34 짝
i=35 짝
i=36 짝짝
i=37 짝
i=38 짝
i=39 짝짝
i=40
i=41
i=42
i=43 짝
i=44
i=45
i=46 짝
i=47
i=48
i=49 짝
i=50
i=51
i=52
i=53 짝
i=54
i=55
i=56 짝
i=57
i=58
i=59 짝
i=60 짝
i=61 짝
i=62 짝
i=63 짝짝
i=64 짝
i=65 짝
i=66 짝짝
i=67 짝
i=68 짝
i=69 짝짝
i=70
i=71
i=72
i=73 짝
i=74
i=75
i=76 짝
i=77
i=78
i=79 짝
i=80
i=81
i=82
i=83 짝
i=84
i=85
i=86 짝
i=87
i=88
i=89 짝
i=90 짝
i=91 짝
i=92 짝
i=93 짝짝
i=94 짝
i=95 짝
i=96 짝짝
i=97 짝
i=98 짝
i=99 짝짝
i=100
 */