//배열 복사해서 붙이기
public class Arraycopy_Ex {
    public static void main(String[] args){

        char [] abc = {'A','B','C','D'};
        char [] num = {'0', '1', '2', '3', '4', '5', '6', '7' ,'8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length); // abc[0]에서 result[0]으로 abc.length개의 데이터 복사
        System.arraycopy(num,0,result,abc.length, num.length);  // result[0]~result[3]까지 abc가 자리했다. abc.length == 4 따라서 result[4]
        System.out.println(result);

        System.arraycopy(abc,0,num,0,abc.length);
        System.out.println(num);

        System.arraycopy(abc,0,num,6,3);
        System.out.println(num);
    }
}
/*
arraycopy(배열명 , 이 숫자부터 , 붙일 대상 배열명 , 이 숫자번째 부터 붙인다. , 이 숫자갯수만큼 붙인다.);
ABCD
0123456789
ABCD0123456789
ABCD456789
ABCD45ABC9
 */

