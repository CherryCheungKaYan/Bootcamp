/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    System.out.println(method(nums));
    System.out.println(method(nums2));
    System.out.println(method(nums3));
    System.out.println(method(nums4));

    // Your program should be able to handle all the above test case.

    // int secondMax = Integer.MIN_VALUE;
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > max) { //
    // secondMax = max; //
    // max = nums[i]; //
    // } else if (nums[i] > secondMax) {
    // secondMax = nums[i];
    // }
    // }
    // System.out.println("Second Max= " + secondMax);
  }

  public static int method(int[] nums) {
    int secondMax = Integer.MIN_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) { //
        secondMax = max; //
        max = nums[i]; //
      } else if (nums[i] > secondMax) {
        secondMax = nums[i];
      }
    }
    return secondMax;
  }
}
// code here
