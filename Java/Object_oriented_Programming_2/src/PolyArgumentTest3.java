import java.util.*;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }

    Product2() {
        price = 0;
        bonusPoint = 0;
    }
}

class samsungTv extends Product2 {
    samsungTv() {
        super(100);
    }

    public String toString() {
        return "samsungTv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을 구입했다 너가.");
    }

    void refund(Product2 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을 반품했다.");
        } else {
            System.out.println("구입한 제품중 해당제품이 없다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입한 제품이 없다.");
            return;
        }
        for (int i = 0; i < item.size(); i++) {
            Product2 p = (Product2) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입한 총 금액 " + sum + " 만원.");
        System.out.println("구입한 제품은 " + itemList + " 이다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String args[]) {
        Buyer2 b = new Buyer2();
        samsungTv tv = new samsungTv();
        Computer2 com = new Computer2();
        Audio2 audio = new Audio2();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
/*
samsungTv을 구입했다 너가.
Computer을 구입했다 너가.
Audio을 구입했다 너가.
구입한 총 금액 350 만원.
구입한 제품은 samsungTv, Computer, Audio 이다.

Computer을 반품했다.
구입한 총 금액 150 만원.
구입한 제품은 samsungTv, Audio 이다.

 */