import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Formatter.BigDecimalLayoutForm;

public class Caculator {

  private BigDecimal x;
  private BigDecimal y;

  public Caculator(BigDecimal x, BigDecimal y) {
    this.x = x;
    this.y = y;

  }

  public double add() { // 0.3 // later new object
    return x.add(y).doubleValue();

  }

  public double subtract() { // 0.3 // later new object
    return x.subtract(y).doubleValue();

  }

  public static Caculator of(double x, double y) { // Static Method follow class , can use .
    return new Caculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
  }

  //Compararion 
  BigDecimal a1 = BigDecimal.valueOf(0.2);
  BigDecimal a2 = BigDecimal.valueOf(0.2);

  if (a1.compareTo(a2) > 0) {
    System.out.println("a1 > a2");
    } else if (a1.compareTo(a2) = 0) {
      System.out.println(a1 == a2) ;{
        System.out.println("a1 == a2")
      } else {  System.out.println("a1 < a2"); }
      }


  public static void main(String[] args) {
    Caculator caculator = new Caculator(BigDecimal.valueOf(0.2), BigDecimal.valueOf(0.1));

    Caculator test = Caculator.of(10.0, 5.0);
    System.out.println(test);
  }

}
