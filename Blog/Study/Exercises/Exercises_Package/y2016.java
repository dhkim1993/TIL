package Exercises_Package;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by kimdonghyun on 09/09/2019.
 */
public class y2016 {

    public String getDayName(int month, int day) {
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
    public static void main(String[] args) {
        y2016 test = new y2016();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
        String s ="23";
        String[]ss = s.split("");
    }
    /*
     public String solution(int a, int b) {
      String answer = "";

      int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
      String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
      int Adate = 0;
      for(int i = 0 ; i< a-1; i++){
          Adate += c[i];
      }
      Adate += b-1;
      answer = MM[Adate %7];

      return answer;
  }
     */
   /* public static void main(String[] args) throws ParseException {
        String[] days ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(days,a,b));
    }
    static String solution(String[] days, int a, int b) throws ParseException {
        String month="" , day ="";
        if(a<10 ) month = "0"+a; else month = a+"";
        if(b<10) day = "0"+b; else day = b+"";
        String inputDate = "2016"+month+day;
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = dateFormat.parse(inputDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return days[cal.get(Calendar.DAY_OF_WEEK)-1];
    }*/
}
