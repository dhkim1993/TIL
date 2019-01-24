public class OperatorEx1 {
    public static void main(String[] args){

        int i = 5;
        i++;
        System.out.println(i);

        i=5;
        ++i;
        System.out.print(i);
    }
}
/*
6
6
이 경우에는 어떤 수식에 포함된것이 아니라 단독적으로 사용된 것이기 떄문에 차이가 없다. 그러나 단독으로 사용되지 않거나 다른
수식에 포함될때는 다르다.
 */