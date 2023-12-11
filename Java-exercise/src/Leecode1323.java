class Solution {

// Input: num = 9996
// Output: 9999
// Explanation: Changing the last digit 6 to 9 results in the maximum number.

  public static int maximum69Number(int num) {
    String str = String.valueOf(num);

    // char[] arr = new char[4];
    char[] arr = str.toCharArray();
    for (int i = 0; i < 4; i++) {
      if (arr[i] == '6') {
        arr[i] = '9';
        break;
      }
    }
  
    // arr ->String -> int
    int num2 = Integer.parseInt(String.valueOf(arr));
  }

  public static void main(String[] args) {
    int num = 6699;

    System.out.println(maximum69Number(num));
  }

}
