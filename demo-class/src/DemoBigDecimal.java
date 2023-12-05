import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {

  public static void main(String[] args) {
    double d = 0.1 + 0.2;
    System.out.println("d = " + d); // precision loss during operation -> 0.30000000000000004

    if (d > 0.3)
      System.out.println("d > 0.3 = " + (d > 0.3)); // 0.3 is NOT > 0.3, should be false
    System.out.println();

    // BigDecimal is used to do arithmatic operation on double
    BigDecimal bd1 = new BigDecimal("0.1"); // String convert to char[]. Not recoomanded!
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // use Double.toString(val) -> convert to String

    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue());

    BigDecimal bd4 = bd3.subtract(bd1);
    System.out.println(bd4.doubleValue());

    double s2 = 0.3 - 0.1;
    System.out.println(s2); // use double cause precision loss

    BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
    System.out.println(b1.doubleValue()); // 0.2

    // multiply: 0.1 * 0.2
    double d2 = 0.1 * 0.2;
    System.out.println(d2); // error

    BigDecimal db01 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println("db01=" + db01.doubleValue());

    // divide: 0.3 / 0.1
    double d3 = 0.1 / 0.2;
    System.out.println(d3); // error

    BigDecimal db02 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1));
    System.out.println("db02=" + db02.doubleValue());

  }

BigDecimal aroundinBigDecimal = BigDecimal.valueOf(10)
.divide(BigDecimal.valueOf(3),4,RoundingMode.DOWN)
.add(BigDecimal.valueOf(5.0))
.subtract(BigDecimal.valueOf(2.1))
.setScale(2, RoundingMode.DOWN);
System.out.println(roundingBigDecimal);

  public static double sum(double d1, double d2) {
    return BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(0.1)).doubleValue();

  }
    }
 