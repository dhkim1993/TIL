package Exercises_Package;

import java.util.Arrays;

/**
 * Created by kimdonghyun on 09/09/2019.
 */
public class completion_player {
    public static void main(String[] args) {
        String[] participant = {"a","b","g","c","f","a"};
        String[] completion = {"a","b","c","a","f"};
        System.out.println(solution(participant, completion));
    }
    static String solution(String[] participant, String[] completion){
        Arrays.sort(participant);
        Arrays.sort(completion);
        String result=participant[participant.length-1];
        int i=0;
        while (i < completion.length){
            if(!participant[i].equals(completion[i])) {
                result=participant[i];
                break;
            }
            i++;
        }
        return result;
    }
}