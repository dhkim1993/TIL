package Thread_Package;

import java.awt.*;

public class SleepTest {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 10; i++) {
            t.beep();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e ){

            }
        }
    }
}
