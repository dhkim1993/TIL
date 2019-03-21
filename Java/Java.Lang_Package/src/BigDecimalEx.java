import java.math.*;

import static java.math.BigDecimal.*;
import static java.math.RoundingMode.*;

class BigDecimalEx {
    public static void main(String[] args) throws Exception {
        BigDecimal bd1 = new BigDecimal("123.456");
        BigDecimal bd2 = new BigDecimal("1.0");

        System.out.print("bd1=" + bd1);
        System.out.print(",\tvalue=" + bd1.unscaledValue());
        System.out.print(",\tscale=" + bd1.scale());
        System.out.print(",\tprecision=" + bd1.precision());
        System.out.println();

        System.out.print("bd2=" + bd2);
        System.out.print(",\tvalue=" + bd2.unscaledValue());
        System.out.print(",\tscale=" + bd2.scale());
        System.out.print(",\tprecision=" + bd2.precision());
        System.out.println();


        BigDecimal bd3 = bd1.multiply(bd2);
        System.out.print("bd3=" + bd3);
        System.out.print(",\tvalue=" + bd3.unscaledValue());
        System.out.print(",\tscale=" + bd3.scale());
        System.out.print(",\tprecision=" + bd3.precision());
        System.out.println();

        System.out.println(bd1.divide(bd2, 2, HALF_UP)); // 123.46
        System.out.println(bd1.setScale(2, HALF_UP));    // 123.46
        System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP)));
    }
}
/*
bd1=123.456,	value=123456,	scale=3,	precision=6
bd2=1.0,	value=10,	scale=1,	precision=2
bd3=123.4560,	value=1234560,	scale=4,	precision=7
123.46
123.46
1.2E+2
 */