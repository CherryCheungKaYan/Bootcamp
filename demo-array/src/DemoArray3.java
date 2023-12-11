import java.util.Arrays;

public class DemoArray3 {

  public static void main(String[] args) {
    // int[] arr = new int[] { 100, -100, 34 };

    // for loop
    // for (int i = 0; i < arr.length; i++) {
    // if (i == 0) {
    // // swapping
    // int temp = arr[i];
    // arr[i] = arr[i + 1];
    // arr[i + 1] = temp;
    // }
    // }
    // System.out.println(Arrays.toString(arr));

    // move target index value to the tail of the array
    int[] arr2 = new int[] { 100, -20, 4, 100, 500, };
    int targetIndex = 1;
    expected result = {100, 4, 100 ,500,-20};
    for loop
    for (int i = 0; i < arr2.length - 1; i++) {
    if (i >= targetIndex) {
    int temp = arr2[i];
    arr2[i] = arr2[i + 1];
    arr2[i + 1] = temp;
    }
    }
    System.out.println(Arrays.toString(arr2));

    // Find Max value, move to the tail
    int[] arr3 = new int[] { 100, 4, 1050, 500, -20 };
    // approach 1
    int max = 0;
    int maxIndex = -1;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
        maxIndex = i;
      }
    }
    // Move the tail ?
    int temp = arr3[maxIndex];
    arr3[maxIndex] = arr3[arr3.length - 1];
    arr3[arr3.length - 1] = temp;

    // Arroach 2:
    int[] arr4 = new int[] { 100, 4, 1050, 500, -20 };
    // for (;;) {
    // for (int i = 0; i < arr4.length - 1; i++) {
    // if (arr4[i] > arr4[i + 1]) {
    // temp = arr4[i];
    // arr4[i] = arr4[i + 1];
    // arr4[i + 1] = temp;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr4));

    String s = "abcdaabcaabcaabc";
    char[] arr5 = new char[s.length()];
    // Approach 1
    for (int i = 0; i < s.length(); i++) {
      arr5[i] = s.charAt(i);
    }
    // Approach 2
    char[] arr6 = s.toCharArray(); //
    // replace a -> c (String)

    char[] arr7 = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        arr7[i] = 'c';
      } else if (s.charAt(i) == 'c') {
        arr7[i] = 'a';
      } else {
        arr7[i] = s.charAt(i);
      }
    }
    System.out.println(Arrays.toString(arr7));

    // From array to String
    System.out.println(String.valueOf(arr7));

    String str = "hello";
    str = new String("hello");
    str = String.valueOf("hello");

    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(new char[] { 'a', 'b' })); // ab
    // System.out.println(new char[] {'a', 'b'}); //ab

    // Replace (String method)
    String str4 = "abcdaabcaabcaabc";
    String result4 = str4.replace('a', 'c'); //replace a by c
    System.out.println("str4=" + str4);
    System.out.println("result=" + result4);

  }
}
