import java.util.Arrays;

public class DemoArray3 {

  public static void main(String[] args) {
    int[] arr = new int[] { 100, -100, 34 };

    // for loop
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        // swapping
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
    
    // move target index value 
  }
}