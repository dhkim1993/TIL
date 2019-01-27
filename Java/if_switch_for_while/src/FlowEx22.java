class FlowEx22 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for (int tmp : arr) {   //arr의 크기만큼 for문을 돌리고 arr의 첫번째 값을 tmp에 저장하는거같다.
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum=" + sum);
    }
}
/*
10 20 30 40 50
10 20 30 40 50
sum=150

위에 for문과 밑에있는 for문의 값이 같은걸 보여주는것이다.
 */