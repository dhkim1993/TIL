import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kimdonghyun on 07/10/2019.
 */
public class H_Index {
    public static void main(String[] args) {
        int[] citations  ={3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
    public static int solution(int[] citations){
        Arrays.sort(citations);
        List list = new ArrayList();
        for(int i = 1; i<citations.length; i++){
            if(citations[i] <= citations.length-i-1 )
                list.add(citations[i]);
        }
        return (int)Collections.max(list);
    }
}
