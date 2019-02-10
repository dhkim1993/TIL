class Product_ {
    int price;            // 제품의 가격
    int bonusPoint;        // 제품구매 시 제공하는 보너스점수

    Product_(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);    // 보너스점수는 제품가격의 10%
    }
}

class LGTv extends Product_ {
    LGTv() {        // 메인에서 호출해서 옴.
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);            // Tv의 가격을 100만원으로 한다.
    }

    public String toString() {    // Object클래스의 toString()을 오버라이딩한다.
        return "LGTv";
    }
}

class Computer extends Product_ {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {            // 고객, 물건을 사는 사람
    int money = 1000;    // 소유금액
    int bonusPoint = 0;    // 보너스점수

    void buy(Product_ p) {
        if (money < p.price) {  //티비는 else라서 넘어감
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;    // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

class PolyArgumentTest {
    public static void main(String args[]) {
        Buyer b = new Buyer();  //첫번쨰로 Buyer인스턴스 생성

        b.buy(new LGTv());  //LGTv생성자로 ㄱㄱ  b.buy(100) ㄱㄱ
        b.buy(new Computer());  //컴터 생성자에서 200 가져오고 b.buy(200) ㄱㄱ

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
/*
LGTv을/를 구입하셨습니다.
Computer을/를 구입하셨습니다.
현재 남은 돈은 700만원입니다.
현재 보너스점수는 30점입니다.
 */