package Exercises_Package;

/**
 * Created by kimdonghyun on 20/09/2019.
 */
public class Workout_Clothes {
    public static void main(String[] args) {
        int n =5;
        int[] lost={2,4};
        int[] reserve={3};
        System.out.println(solution(n, lost, reserve));
    }
    static int solution(int n, int[] lost, int[] reserve){

        int[] margeArr = new int[lost.length+reserve.length];
        System.arraycopy(lost,0,margeArr,0,lost.length);
        System.arraycopy(reserve,0,margeArr,lost.length,reserve.length);


        return 0;
    }
}
