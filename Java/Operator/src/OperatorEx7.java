public class OperatorEx7 {
    public static void main(String[] args){

        byte a= 10;
        byte b= 30;
        byte c = (byte)(a*b);
        System.out.println(c);
    }
}
/*
44
큰 자료형에서 작은 자료형으로 변환하면 데이터의 손실이 발생한다.
32비트를 8비트로 짤라버리니 44가 된것
 */