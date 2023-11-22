public class DeomString {
  public static void main (String[] args) {

    String emailAddress = "vincent@gmail.com";
    // String s = 3; // s is declare by String, so you cannot assaign the value 
    // int i = "Hello"; // i is declared by int, you cannot assign String value 

    System.out.println(emailAddress); //vincent@gmail.com

    // Operations -> appened (concat)
    String str = "hello" + " " + "world";
    System.out.println(str); // "hello world"

    // Always look at the code inside the bracket first
    // Step 1: "hello" + " " + "world" -> "hello world"
    // Step 2: System.out.println() -> Print out
    System.out.println("hello" + " " + "world"); //"hello world"

    String str1 = "hello";
    System.out.println(str1); //hello
    System.out.println(str1.length()); //5
    str1 = str1 + " world";
    System.out.println(str1); // hello world
    str1 += " hi ";
    System.out.println(str1);

      // charAT()
  // 4 is an index of String
  // Example: "hello", h -> index =0
  // e -> index = 1
  // l -> index = 2
  // l -> index = 3
  // o -> index = 4
  // s1.chatAt(4) return 'o'
  char c = s1.charAt(4);
  System.out.println(c); // 'o'

  s1 = "Vincent";
  // what if we alwasys get the last character of the String 
  // length() charAt()
  // Approach 1
  int lastCharIndex = s1.char.length() -1;
  char lastChar = s1.charAt(lastCharIndex);
  // Approach 2
  lastChar = s1.charAt(s1.length() -1);


    // No "-", "*", "/", in String
  }
}
