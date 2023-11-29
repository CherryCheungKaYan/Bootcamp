import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610]
   */
  // a2 a1 e
  // Count the target of character in a String.
  public static void main(String[] args) {
    int[] arr2 = new int[15];
    int cherry = 20;
    arr2[0] = cherry;
    arr2[10] = cherry;

    // for loop to print first 15 numbers in Fibonacci Sequence
    int second = 1;
    int first = 1;
    int thirdNumber = 1;
    int[] arr = new int[15];
    int idx = 0;
    arr[idx++] = second; // arr = 0 -> idex = 1
    while (thirdNumber < 700) {
      thirdNumber = first + second;
      second = first;
      arr[idx++] = first; // arr 1
      first = thirdNumber;
    }
    System.out.println(Arrays.toString(arr));
  }
}