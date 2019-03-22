package Data_Time_and_Formatting_Package;

import java.util.Calendar;

class CalendarEx2 {
    public static void main(String[] args) {
        // 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar HMbirthday = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        // month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야한다.
        // HMbirthday.set(2015, Calendar.AUGUST, 15);와 같이 할 수도 있다.
        HMbirthday.set(2019, 7, 9); // 2015년 8월 15일로 날짜를 설정한다.
        System.out.println("HMbirthday은 " + toString(HMbirthday) + DAY_OF_WEEK[HMbirthday.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
        System.out.println("오늘(today)은 " + toString(today) + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

        // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야한다.
        long difference = (today.getTimeInMillis() - HMbirthday.getTimeInMillis()) / 1000;
        System.out.println("그 날(HMbirthday)부터 지금(today)까지 " + difference + "초가 지났습니다.");
        System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일입니다.");    // 1일 = 24 * 60 * 60
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
/*
HMbirthday1은 2019년 8월 9일 금요일이고,
오늘(today)은 2019년 3월 22일 금요일입니다.
그 날(HMbirthday)부터 지금(today)까지 -12095999초가 지났습니다.
일(day)로 계산하면 -139일입니다.
 */
