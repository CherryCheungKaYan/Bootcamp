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
    str1 += " hi";
    System.out.println(str1);


    // No "-", "*", "/", in String
  }
}
