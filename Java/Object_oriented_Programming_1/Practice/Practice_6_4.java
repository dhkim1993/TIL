class Student {
    String name;
    int ban;
    int no;
    int math;
    int kor;
    int eng;

    public int getTotal() {
        return math + eng + kor;
    }

    public float getAverage() {

        return Math.round((math + eng + kor) / 3F * 10) / 10.0F; //return (float)getTotal()/3.0f;
    }
}

public class Practice_6_4 {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}
/*
[실행결과]
이름:홍길동
총점:236
평균:78.7
 */
