class FlowEx19 {
    public static void main(String[] args) {

        for(int i=1;i<=3;i++) {
            if (i != 1) {
                System.out.println();
            }
            for (int j = 1; j <= 3; j++)
                for (int k = 1; k <= 3; k++)
                    System.out.printf("%d%d%d ", i, j, k);
        }
    }
}
/*
111 112 113 121 122 123 131 132 133
211 212 213 221 222 223 231 232 233
311 312 313 321 322 323 331 332 333
 */