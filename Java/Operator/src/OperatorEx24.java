public class OperatorEx24 {
    public static void main(String[] args){

        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x=2%d, 10<x&&x<20 = %b%n", x, 10<x && x < 20);

        x= 6;
        System.out.printf("x=%2d, x%%2==0 || x%%3==- && x%%6!=0 =%b%n", x, x%2==0 || x%3==0 && x%6!=0);
    }
}
