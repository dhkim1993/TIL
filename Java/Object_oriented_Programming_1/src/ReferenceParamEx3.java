public class ReferenceParamEx3 {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 1, 6, 5, 4};

        printArr(arr); //배열출력
        sortArr(arr);   //정렬
        printArr(arr);  //정렬후 배열출력
        System.out.println("sum=" + sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }//if end
            }//for end
        }//for end
    }//sortArr end
}
/*
[3,2,1,6,5,4,]  printArr 하고 sumArr 한다.
[1,2,3,4,5,6,]  sortArr
sum=21      sumArr
 */