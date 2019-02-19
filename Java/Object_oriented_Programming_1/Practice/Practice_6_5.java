/*
[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
 */
public class Practice_6_5 {
    public static void main(String[] args) {
        Student4 s = new Student4("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}

class Student4 {
    static String name;
    static int q, w, e, r, t;

    Student4(String name, int q, int w, int e, int r, int t) {

        this.name = name;
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
        this.t = t;
    }

    static int Total() {
        return e + r + t;
    }

    static float Avg() {
        return Math.round(Total() / 3f * 10) / 10f;
    }

    static String info() {
        return name + "," + q + "," + w + "," + e + "," + r + "," + t + "," + Total() + "," + Avg();
    }
}
/*
실행결과]
홍길동,1,1,100,60,76,236,78.7
 */
