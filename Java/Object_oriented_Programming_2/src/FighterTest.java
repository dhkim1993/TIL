public class FighterTest {
    public static void main(String[] args) {

        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손이다.");
        if (f instanceof Fightable)
            System.out.println("f는 Fightable interface를 구현했씁니다..");
        if (f instanceof Movable)
            System.out.println("f는 Movable interface를 구현했씁니다..\"");
        if (f instanceof Attackable)
            System.out.println("f는 Attackable interface를 구현했씁니다..\"");
        if (f instanceof Object)
            System.out.println("f는 Object interface를 구현했씁니다..\"");
    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {    //오버라이딩 할때 조상의 메소드보다 넓은 범위의 접근 제어자를 지정ㅎ야햔다.
    }

    public void attack(Unit u) {
    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {
}

interface Movable {
    void move(int x, int y);    //public abstract void move
}

interface Attackable {
    void attack(Unit u);
}
/*
f는 Unit클래스의 자손이다.
f는 Fightable interface를 구현했씁니다..
f는 Movable interface를 구현했씁니다.."
f는 Attackable interface를 구현했씁니다.."
f는 Object interface를 구현했씁니다.."
 */