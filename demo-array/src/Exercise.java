public class Exercise {

  public static void main(String[] args) {

    int[] nums = new int[] { 8, 3, -10, 30, 100, -19 };
   
    int max= Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >max) {
        max=nums [i] ;
      } 
    }
    System.out.println(max);

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
    System.out.println(sound2("Cat"));
    System.out.println("notification=" + notifyCustomer2());

  }

  public static void sound(String animal) {
    // Early Return
    if ("ABC".equals(animal)) {
      return;
    }
    if ("Dog".equals(animal)) {
      System.out.println("wo wo");
      return;
    } else if ("Cat".equals(animal)) {
      System.out.println("meow");
      return;
    }
    System.out.println("Default sound....");
  }

  public static String sound2(String animal) {

    if ("ABC".equals(animal)) {
      return "Default sound....";
    } else if ("Dog".equals(animal)) {
      return "wo wo";

    } else if ("Cat".equals(animal)) {
      return "meow";
    }
    return "Default sound";
  }

  public static void notifyCustomer() {
    if (sendEmail()) {
      return;
    }
    sendSMS();
  }

  public static boolean notifyCustomer2() {
    if (sendEmail()) {
      return true;
    } else if (sendSMS()) {
      return true;
    }
    return false;
  }

  public static boolean notifyCustomer3() {
    return sendEmail() || sendSMS();
  } // consider email -> T or False -> false -> consider SMS

  public static boolean sendEmail() {
    return false;
  }

  public static boolean sendSMS() {
    return false;
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
    // boolean result =s.indexOf(perfix) == 0;
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