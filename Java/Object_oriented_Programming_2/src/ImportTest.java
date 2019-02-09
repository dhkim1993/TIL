import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {

        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 : " + date.format(today));
        System.out.println("현재 시간은 : " + time.format(today));
    }
}
/*
오늘 날짜는 : 2019/02/09
현재 시간은 : 06:18:14 PM
import로 선언을 해야 패키지명을 생략하고 사용할수 있다.
 */