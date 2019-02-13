public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (Exception e) { //Exception은 모든 예외의 조상클라스이므로 어떤 예외가ㅣ 발생해도 catch문을 실행시킨다.
            System.out.println(5);
        }   //try-catch의 끝.
        System.out.println(6);
    }
}

/*
try-catch는 try 문장에서 예외가 발생하면 catch ( ) 와 instaceof를 해서 true면 catch { } 를 실행하여 예외처리를 한다.
1
2
3
5
6
 */