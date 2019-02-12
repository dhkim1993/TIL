public class RepairableTest {
    public static void main(String[] args) {

        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
      //  scv.repair(marine);
    }
}

interface Repairable {

}

class Unit_ {
    int hitPoint;
    final int MAX_HP;

    Unit_(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit_ {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit_ {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {   // Repairable을 implements하지 않아서 void repair(Repairable r) 에 들어갈수없다,
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {  //Repairable를 구현한 클래스의 매개변수만을 받는다.
        if (r instanceof Unit_) {
            Unit_ u = (Unit_) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝!");
        }
    }
}
/*
Tank의 수리가 끝!
Dropship의 수리가 끝!

 */
