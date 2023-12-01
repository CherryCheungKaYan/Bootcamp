import java.util.Arrays;

public class DemoMethod3 {

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 5, 10 }; // arr = store address of arr ojject
    System.out.println(sum(arr));// 18
    System.out.println("before AddOne():" + Arrays.toString((arr)));
    addOne2(arr); // [3, 5, 10]
    System.out.println("after AddOne():" + Arrays.toString((arr))); // [4, 6, 11]
    System.out.println(Arrays.toString(addOnewrong(arr)));

    String before ="abc";
    System.out.println("before=" + before); //abc

    String after = conactHello2(before);

    System.out.println("before=" + before); //abc
    System.out.println("after" + after); //abchello

  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  // Correct approach
  public static void addOne2(int[] arr) { // Pass by Reference
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
    return;
  }

  // Wrong approach array + 1
  public static int[] addOnewrong(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
    return arr;
  }

  // wrong approach
  public static void conactHello(String s) { // String is "Pass by value"}
    s = s.concat("hello");
  }

  public static String conactHello2(String s) { // String is "Pass by value"}
    s = s.concat("hello");
  }
  // Primitives + Wrapper Classes + String (17 types) -> Pass by value
  // array & classes -> pass by reference
}
