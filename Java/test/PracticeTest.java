import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PracticeTest {

    private int num1 = 50;
    private int num2 = 50;

    private int num3 = 12345;

    Practice_4_11 p11 = new Practice_4_11(this.num1, this.num2);

    Practice_4_10 p10 =  new Practice_4_10(this.num3);


    @Test
    void solution() {
        assertEquals(100, p11.sum);
    }

    @Test
    void solution2() {
        assertEquals(15, p10.numbers());
    }

}

