public class Homework {
  public static void main(String[] args) {

    int[] arr = { 5, 10, 15, 20 };
    int temp = arr[1];
    arr[1] = arr[2];
    arr[2] = temp;

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    String str1 = "Hello, World! I'm Cherry";
    int index = str1.lastIndexOf("Cherry");
    System.out.println(index);

    // Swap Characters in a String
    String text = "Hello";

    char[] chars = text.toCharArray();
    char temp2 = chars[0];
    chars[0] = chars[4];
    chars[4] = temp2;
    String swappedText = new String(chars);
    System.out.println(swappedText);

    // Irrating over 2D-array elements using loop and inner loop
    int[][] arr2d = new int[][] { { 1, 2, 3 }, { 7, 8, 9 }, { 10, 1, 2 } };
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        System.out.println("row=" + i + ", col =" + j + ", val=" + arr2d[i][j]);
      }
    }

    String searchMe = " peter pieer picked a pack of pcikled perrer";
    int count = 0;

    for (int i = 0; i < searchMe.length(); i++) {
      if (searchMe.charAt(i) != 'p') {
        continue;
      }
      count++;
    }
    System.out.println("Found" + count + "p's in the string.");
  }
}
