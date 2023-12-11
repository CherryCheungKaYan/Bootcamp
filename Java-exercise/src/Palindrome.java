import java.util.ArrayList;
import java.util.List;

public class Palindrome {
  private static boolean isPalindrome(String s) {
    char[] arr = s.toCharArray();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[arr.length - i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static List<String> getPalindrom(String[] words) {
    List<String> palindrome = new ArrayList<>();

    for (String word : words) {
      if (isPalindrome(word)) {
        palindrome.add(word);
      }
    }
    return palindrome;
  }

  public static void main(String[] args) {
    String[] words = { "level", "deed", "hello", "hello", "world", "mandam" };
    List<String> palindrome = getPalindrom(words);
    if (palindrome.isEmpty()) {
      System.out.println("No palindromic words found");
    } else {
      System.out.println("Palindromic words are found" + palindrome);
    }

  }
}
