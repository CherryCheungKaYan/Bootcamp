import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // pow()
    System.out.println(Math.pow(2.0, 10)); // 2^10
    System.out.println(Math.pow(2.0, -1)); // 1 / (2^1) 0.5
    System.out.println(Math.pow(2.0, -2)); // 1 / (2^2) 0.25
    System.out.println(Math.pow(-2.0, 3)); // -8.0

    // abs(), absoulute value
    System.out.println(Math.abs(3.2)); // 3.2
    System.out.println(Math.abs(-3.2));// 3.2

    // ceil(), floor
    System.out.println(Math.ceil(3.1)); // 3.0
    System.out.println(Math.ceil(3.9));// 3.0

    System.out.println(Math.round(14.4)); // 14
    System.out.println(Math.round(14.5));// 15

    int [] arr = new int [] {-2, 20, 100, -40};
    int max = -100000;
    // Approach 1
    for (int i = 0; i < 0; i++){
      if (arr[i] > max) {
        max = arr[i];
      }
      // Approach 2
      for (int i = 0; i < arr.length; i++) {
        max = Math.max(arr[i], max);
      }
      int random1 = new Random().nextInt(3);
      System.out.println(Math.random()); //0.0 -1.0 inclusively

      //1-10
      int random2 = (int) (Math.random() *10) +1;
      System.out.println(random2);
    

  }
}
