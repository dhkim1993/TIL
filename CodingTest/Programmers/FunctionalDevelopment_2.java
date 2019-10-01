import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class FunctionalDevelopment_2 {
    public static void main(String[] args) {
        FunctionalDevelopment_2 fd = new FunctionalDevelopment_2();
        int[] progresses = {93,30,55,77,10};
        int[] speeds = {1,30,5,3,10};
        System.out.println(fd.solution(progresses,speeds));
    }
    public int[] solution(int[] progresses, int[] speeds){
        int[] needDaysArr = getNeedDaysArr(progresses,speeds);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=i+1, completeCnt=1;
        while(j <= needDaysArr.length-1){
            if(needDaysArr[i] >= needDaysArr[j]){
                completeCnt++;
                j++;
            } else{
                list.add(completeCnt);
                completeCnt=1;
                i=j;
                j=i+1;
            }
            if(j==needDaysArr.length){
                list.add(completeCnt);
            }
        }
        /*int[] result = new int[list.size()];
        for(int k =0; k<list.size(); k++){
             result[k] = list.get(k).intValue();
            System.out.println(result[k]);
        }*/
        return Arrays.stream(needDaysArr).filter(w -> w!=0).toArray();
    }
    static int[] getNeedDaysArr(int[] progresses, int[] speeds){
        int[] needDaysArr = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int remainder = 100-progresses[i];
            needDaysArr[i] = remainder%speeds[i]>0 ? remainder/speeds[i]+1 : remainder/speeds[i];
        }
        return needDaysArr;
    }
}
/*
public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
 */