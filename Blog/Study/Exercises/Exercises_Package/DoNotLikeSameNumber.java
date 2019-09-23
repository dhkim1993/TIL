package Exercises_Package;

import java.util.ArrayList;


/**
 * Created by kimdonghyun on 23/09/2019.
 */
public class DoNotLikeSameNumber {
    public static void main(String[] args) {
        DoNotLikeSameNumber d = new DoNotLikeSameNumber();
        System.out.println(d.solution());
    }
    public int[] solution() {
        int[] iArr = {1, 1, 2, 4, 4, 3};
        ArrayList<Integer> al = new ArrayList<>();
        int temp =99;
        for(int i : iArr){
            if(i != temp)
                al.add(i);
            temp=i;
        }
        int[] result = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            result[i] = al.get(i).intValue();
        }
        return result;
    }
}
