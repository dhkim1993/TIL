import static java.lang.Math.*;
import static java.lang.System.*;

class MathEx1 {
    public static void main(String args[]) {
        double val = 90.7552;
        out.println("round(" + val + ")=" + round(val));  // ¹Ý¿Ã¸²

        val *= 100;
        out.println("round(" + val + ")=" + round(val));  // ¹Ý¿Ã¸²

        out.println("round(" + val + ")/100  =" + round(val) / 100);  // ¹Ý¿Ã¸²
        out.println("round(" + val + ")/100.0=" + round(val) / 100.0);  // ¹Ý¿Ã¸²
        out.println();
        out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));   // ¿Ã¸²
        out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));  // ¹ö¸²
        out.printf("round(%3.1f)=%d%n", 1.1, round(1.1));  // ¹Ý¿Ã¸²
        out.printf("round(%3.1f)=%d%n", 1.5, round(1.5));  // ¹Ý¿Ã¸²
        out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5));   // ¹Ý¿Ã¸²
        out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5)); // ¹Ý¿Ã¸²
        out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5));  // ¹Ý¿Ã¸²
        out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5));  // ¿Ã¸²
        out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5)); // ¹ö¸²
    }
}
/*
round(90.7552)=91
round(9075.52)=9076
round(9075.52)/100  =90
round(9075.52)/100.0=90.76

ceil(1.1)=2.0
floor(1.5)=1.0
round(1.1)=1
round(1.5)=2
rint(1.5)=2.000000
round(-1.5)=-1
rint(-1.5)=-2.000000
ceil(-1.5)=-1.000000
floor(-1.5)=-2.000000

 */