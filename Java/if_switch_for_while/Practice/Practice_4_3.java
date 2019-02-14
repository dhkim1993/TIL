/*
[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.<br><br>
 */
public class Practice_4_3 {
    public static void main(String[] args){

        int sum=0;

        for(int i=1; i<=9; i++){
           for(int j=1; j<=i+1; j++){
               sum += j;
            }
        }
        System.out.print(sum+1);
    }
}
/*
220
 */