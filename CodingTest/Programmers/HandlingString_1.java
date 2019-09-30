/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class HandlingString_1 {
    public static void main(String[] args) {
        String s = "920412";
        HandlingString_1 handlingString_1 = new HandlingString_1();
        System.out.println(handlingString_1.solution(s));
    }
    public boolean solution(String s){
        if(s.length() == 4 || s.length() == 6){
            char[] cArr = s.toCharArray();
            for (char c : cArr) if(c > '9')  return false;
            return true;
        }
        return false;
    }
}
/*
형변환해서 Exception 뜨면 false.. ㄷㄷ;
if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
 */
