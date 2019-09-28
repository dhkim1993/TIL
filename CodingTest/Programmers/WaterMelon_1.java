/**
 * Created by kimdonghyun on 25/09/2019.
 */
public class WaterMelon_1 {
    public static void main(String[] args) {
        WaterMelon_1 waterMelon1 = new WaterMelon_1();
        int n = 5;
        System.out.println(waterMelon1.solution(n));
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append("수");
            sb.append("박");
        }
        if (n % 2 == 1) sb.append("수");
        return sb.toString();
    }
}
/*
return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
---------------------------------------------------------------------------
 String result = "";
    for (int i = 0; i < n; i++)
      result += i % 2 == 0 ? "수" : "박";
        return result;
    }
    }
 */
