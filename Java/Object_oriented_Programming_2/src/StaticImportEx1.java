import static java.lang.System.out;
import static java.lang.Math.*;


public class StaticImportEx1 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println(Math.PI :"+Math.PI);  PI=파이
        out.println("math.PI : " + PI);
    }
}
/*
0.818353046643449
math.PI : 3.141592653589793
static import를 하면 저렇게 간단하게 생략하여 작성할 수 있는걸 보여주는 예제이다.
 */