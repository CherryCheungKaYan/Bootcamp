public class Exercise {

  public static void main(String[] args) {
    String s1 = String.valueOf("abc");
    String s2 = String.valueOf("def");
    System.out.println(append(s1, s2));
    System.out.println(getLastChar(s1));
    String s3 = String.valueOf("abcbcdabc");
    String s4 = String.valueOf("xxxxx");
    String s5 = String.valueOf("helloworld");
    String s6 = String.valueOf("hello");
    System.out.println(isStartedWith(s5, s6));
    System.out.println(remove(s3, s4));
    System.out.println(replace(s5, s6, s1));

  }

  // s1 -> "abc"
  // s2 -> "def"
  // return "abcdef"
  public static String append(String s1, String s2) {
    return s1.concat(s2);
  }

  // Get the last character of the String s
  // if s length < 1, return ' ' (space character)
  public static char getLastChar(String s) {
    return s.charAt(s.length() - 1);
  }

  // s -> "helloworld"
  // prefix -> "hello"
  // return true
  public static boolean isStartedWith(String s, String prefix) {
    // return false;
    return s.startsWith(prefix);
  }

  // s -> "abcbcdabc"
  // toBeRemove -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemoved) {
    return s.replace(toBeRemoved, "");
  }

  public static String replace(String s, String toBeReplaced, String s1) {
    return s.replace(toBeReplaced, s1);
  }

}