public class DemoString {
  public static void main(String[] args) {

    String emailAddress = "vincent@gmail.com";
    // String s = 3; // s is declared by String, so you cannot assign int value
    // int i = "hello"; // i is declared by int, you cannot assign String value

    System.out.println(emailAddress); // vincent@gmail.com

    // Operations -> append (concat)
    String str = "hello" + " " + "world";
    System.out.println(str); // "hello world"

    // Always look at the code inside the bracket first
    // Step 1: "hello" + " " + "world" -> "hello world"
    // Step 2: System.out.println() -> Print out
    System.out.println("hello" + " " + "world"); // "hello world"

    String str1 = "hello";
    System.out.println(str1); // "hello"
    System.out.println(str1.length()); // 5
    str1 = str1 + "world";
    System.out.println(str1.length()); // 10
    str1 += "!!!";
    System.out.println(str1.length()); // 13

    // if, =, ==
    int x = 0; // = means assigngment
    int x2 = 3; // = means assignment
    if (x == x2) { // == means, asking if they are equals
      // "x == x2" return false, so the flow will not fall into this block
      System.out.println("x is equals to x2");
    } else {
      System.out.println("x is not equals to x2");
      // sysout is the shortcut for System.out.println()
    }

    // String is not a primitive, so you cannot use == to compare their values
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)) { // comparing two string variables
      System.out.println("s1 is equals to s2");
    }
    if ("hello".equals(s1)) { // comparing string value to a string variable
      // if (s1.equals("hello")) // don't code in this way
      System.out.println("s1 is hello");
    }
    if ("hello".equals("hello")) { // always true
      System.out.println("ABC");
    }

    // charAt()
    // 4 is an index of String.
    // Example: "hello", h -> index =0
    // e -> index = 1
    // l -> index = 2
    // l -> index = 3
    // o -> index = 4
    // s1.charAt(4) return 'o'
    char c = s1.charAt(4);
    System.out.println(c); // 'o'

    s1 = "Vincent";
    // what if we always get the last character of the String
    // length() charAt()
    // Approach 1
    int lastCharIndex = s1.length() - 1;
    char lastChar = s1.charAt(lastCharIndex);
    // Approach 2
    lastChar = s1.charAt(s1.length() - 1);

    // No "-", "*", "/" in String
    // String supports "+", "+="
  }

}
