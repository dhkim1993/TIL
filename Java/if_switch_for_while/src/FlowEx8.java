import java.util.*;

class FlowEx8 {
    public static void main(String[] args) {
        char gender;
        String regNo = "";

        System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");

        Scanner scanner = new Scanner(System.in);
        regNo = scanner.nextLine();

        gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장

        switch (gender) {
            case '1':
            case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
                ;
        }
    } // main의 끝
}
/*
charAt 이라는 함수는 charAt(int x, int y) x번째부터 y번쨰까지 추출하는 함수다.
당신의 주민번호를 입력하세요.(011231-1111222)>930404-1382821
당신은 남자입니다.
 */