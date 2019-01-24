public class OperatorEx6 {
    public static void main(String[] args){

        byte a=10;
        byte b=20;
        byte c=(byte)(a+b);
        System.out.print(c);
        //byte c=a+b;
        /*  연산자 '+'는 int 자료형으로 변환한 다음에 수행한다. 근데 byte 면 수행 할수 없다.
            int는 4byte고 byte는 1byte이기 때문에 형변환 없이 저장할수 없기에 안된다.
            크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할때는 자동으로 형변환이 되지만
            반대로 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 사용자를 사용해서
            형변환을 해주어야한다.

            30
            */
        //System.out.println(c);
    }
}
