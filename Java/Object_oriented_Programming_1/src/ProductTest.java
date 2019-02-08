public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호 (serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호 (serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호 (serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
    }
}                       //ProductTest의 인스턴스가 생성될떄마다 인스턴스블럭이 실행된다.

class Product {
    static int count = 0;       //static이므로 1번만 실행해서 초기화시킴
    int serialNo;

    {
        ++count;
        serialNo = count;   //인스턴스 초기화블럭
    }

    public Product() {} // 기본생성자 생략가능하다 지금 아무생성자도 없기떄문에.
}
/*
p1의 제품번호 (serial no)는 1
p2의 제품번호 (serial no)는 2
p3의 제품번호 (serial no)는 3
생산된 제품의 수는 모두 3개 입니다.

 */