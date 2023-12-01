public class DemoCache {

  public static void main(String[] args) {

    String s1 = "John";
    String s2 = "John";

    System.out.println(s1.equals(s2)); // true (same value)
    // ==, check it they are same object
    System.out.println(s1 == s2);

    String s3 = new String("John");
    System.out.println(s1.equals(s3)); // true (same value) check value
    System.out.println(s1 == s3); // false checking address

    String s4 = String.valueOf("John");
    System.out.println(s1.equals(s4)); // true same value
    System.out.println(s1 == (s4)); // true s4's String object is in Literal Pool
    System.out.println(s2 == (s4)); // true s4's String object is in Literal Pool
    System.out.println(s3 ==(s4)); // false

    s1 = "John2";
    System.out.println( s1 == s4); //false
    System.err.println( s2 == s4); //true

    s2 = s2 + "3"; // "John3"
    System.out.println(s2 == s4); //false

  }
}
