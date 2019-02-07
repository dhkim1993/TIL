public class ReferenceParamEx2 {
    public static void main(String[] args) {

        int[] x = {10};
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("change() : x= " + x[0]);
    }
}
/*
main() : x = 10
change() : x= 1000
After change(x)
main() : x = 1000
배열도 참조변수이기 떄문에 주소값을 전달받아 그 주소값안에 있는 값을 변경하기 땨문에 값이 바뀐것.
 */