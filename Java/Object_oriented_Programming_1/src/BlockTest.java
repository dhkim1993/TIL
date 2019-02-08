public class BlockTest {
    static {
        System.out.println("static { }");   //클래스 초기화 블럭
    }

    {
        System.out.println("{ }");  //인스턴스 초기화 블럭
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();

    }
}
/*
static { }  클래스 초기화 블럭은 1번만 실행됨
BlockTest bt = new BlockTest();     main실행
{ }     인스턴스 초기화블럭은 인스턴스가 생성될떄마다 실행
생성자     마지막으로 생성자가 실행
BlockTest bt2 = new BlockTest();
{ }
생성자

 */
