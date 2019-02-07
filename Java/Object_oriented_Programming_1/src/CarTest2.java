class Car_2 {
    String color;
    String gearType;
    int door;

    Car_2() {
        this("white", "auto", 4);

    }

    Car_2(String color) {
        this(color, "auto", 4);
    }

    Car_2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car_2 c1 = new Car_2();
        Car_2 c2 = new Car_2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
/*
c1의 color=white, gearType=auto, door=4
c2의 color=blue, gearType=auto, door=4
 */