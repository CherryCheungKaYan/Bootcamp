
public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false
  // otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or
  // from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res1 = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);
  }

  // Code a method here to return true if the integer is palindrome, otherwise
  // false
  public static boolean palindrome(int num) {
    // code here ...
    String rest1 = Integer.toString(num);
    for (int i = 0; i < rest1.length(); i++) 
    if {
      rest1.indexOf(0) == rest1.length()-1
    }
    if {
      retrun true
    }
    
    return false;
  }
}