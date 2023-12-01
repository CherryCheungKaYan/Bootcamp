public class Exercise1 {
  public static void main(String[] args) {

    int[] nums = new int[] { 8, 3, -10, 30, 100, -19 };
    int maxIndex = 0;
    int 
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[maxIndex]) {
        maxIndex = i;
        System.out.println("maxIndex=" + maxIndex);
        // System.out.println(i);
      }
    }

    
  }
}
