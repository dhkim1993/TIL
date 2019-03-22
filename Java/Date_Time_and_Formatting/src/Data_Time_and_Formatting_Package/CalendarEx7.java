package Data_Time_and_Formatting_Package;

import java.util.Calendar;

class CalendarEx7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx7 2015 11");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance();       // 시작일
        Calendar eDay = Calendar.getInstance();       // 끝일

        // 월의 경우 0 부터 11까지의 값을 가지므로 1을 빼줘야한다.

        sDay.set(year, month - 1, 1);     // 입력월의 1일로 설정한다.
        // 입력월의 말일로 설정한다.
        eDay.set(year, month - 1, sDay.getActualMaximum(Calendar.DATE));
        // 1일이 속한 주의 일요일로 날짜설정.
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
        // 말일이 속한 주의 토요일로 날짜설정
        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("      " + year + "년 " + month + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        //시작 일부터 마지막 일까지(sDay <= eDay) 1일씩 증가시키면서 일(Calendar.DATE)을 출력
        for (int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
            int day = sDay.get(Calendar.DATE);
            System.out.print((day < 10) ? "  " + day : " " + day);

            if (n++ % 7 == 0) System.out.println();    // 7일치를 찍고 나서 줄을 바꾼다.
        }
    } // main
}
/*
     2019년 3월
 SU MO TU WE TH FR SA
 24 25 26 27 28  1  2
  3  4  5  6  7  8  9
 10 11 12 13 14 15 16
 17 18 19 20 21 22 23
 24 25 26 27 28 29 30
 31  1  2  3  4  5  6
 */
