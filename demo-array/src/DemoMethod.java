public class DemoMethod {

  // main -> method name
  // public -> or private
  // static method -> tool
  // void -> no return type
  public static void main(String[] args) {
    // javac -> compile command, converting .java -> class
    // java -> run.class file
    int x = 2;
    int y = 10;
    x *= 2; // 4
    x += y;
    System.out.println("x=" + x); // 14

    // Trigger Method
    int result10 = sum(10, 3);
    System.out.println(result10); // 13
    System.out.println(sum(2, 4)); // 6
    System.out.println(sum(-10, -30)); // -40

    // find if any method with 3 input parameters

    int result13 = sum(10, 3, 4);
    int result14 = sum(10, 3, c);

    int result2 = substract(6, 3);
    System.out.println("result=" + result2);

    int result3 = multipy(6, 3);
    System.out.println("result=" + result3);

    double result4 = divide(6, 5);
    System.out.println("result=" + result4);

    double v = (double) 7 / 2; // double
  }

  // Method name: sum
  // return type: int
  // parameters: No paramenter, one or more that one parameters
  // f(x1, x2) = x1 + x2
  // y = x1 + x2
  public static int sum(int x1, int x2) {
    int total = x1 + x2;
    return total;
  }
//  Method signature: sum (int x1, int x2, int x3)
  public static int sum(int x1, int x2, int x3) {
    int total = x1 + x2 + x3;
    return total;
  }
// Method signature: sum (int x1, int x2, char x3)
  public static int sum(int x1, int x2, char x3) {
    int total = x1 + x2 + x3;
    return total;
  }

  public static int substract(int y1, int y2) {
    int total2 = y1 - y2;
    return total2;
  }

  public static int multipy(int z1, int z2) {
    int total3 = z1 * z2;
    return total3;
  }

  public static double divide(int g1, int g2) {
    double total4 = (double) g1 / (double) g2;
    return total4;
  }

}