public class Document {
    static int count = 0;
    String name;        //자동으로 null값으로 초기화됨

    Document() {
        this("제목없음" + ++count);     //생성자 호출임. 다른 생성자가 있기떄문에 기본생성자를 써줘야함.
    }

    Document(String name) { //String 매개변수가 있는 생성자.
        this.name = name;   //this.name 은 인스턴스고 =name은 배개변수.
        System.out.println("문서" + this.name + "가 생성되었습니다.");
    }
}

class DocumentTest {
    public static void main(String args[]) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
/*
문서제목없음1가 생성되었습니다.
문서자바.txt가 생성되었습니다.
문서제목없음2가 생성되었습니다.
문서제목없음3가 생성되었습니다.
 */
