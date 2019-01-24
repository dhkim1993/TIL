public class OperatorEx2 {
    public static  void main(String[] args){

        int i=5, j=0;

        j = i++;
        System.out.println("j=i++; 실핼후, i=" +i +", j=" +j);

        i=5;
        j=0;

        j= ++i;
        System.out.println("j=++i; 실행후, i=" + i+", j=" +j);
    }
}
/*
j=i++; 실핼후, i=6, j=5
j=++i; 실행후, i=6, j=6

 */