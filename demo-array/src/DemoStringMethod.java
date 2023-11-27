public class DemoStringMethod {
  public static void main(String[] args) {
    String str = " hello world!";

    // empty
    if (str.isEmpty()) {
      {
        System.out.println("String=" + str);
      }
      System.out.println("str.length=" + str.length());
    }

    // even number index of the character in string
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) {
        System.out.print(str.charAt(i));
      }
    }

    // substring(startIndex, endInedx - 1)
    // substring(startIndex)

    String s = "hello";
    String newStr = s.substring(2, 4); // index start from 0
    System.out.println("newStr=" + newStr); // ll, print -> index from 2-3.

    // trim(), remove all spaces in the head and tail of the string
    // str = " hello world! "
    System.out.println(str.trim()); // " hello world! "
    System.out.println(newStr.trim()); // "ll"

    String s2 = "Hello, woRld!!";
    System.out.println(s2.toUpperCase()); // "HELLO, WORLD!!"
    System.out.println(s2.toLowerCase()); // "hello world!!

    // equals()
    // equalsIngoreCase()
    System.err.println("hello, world!!".equals("hello, world")); // false

    // startsWith("")
    // endWith ("")
    // String s2 = "Hello, woRld!!";
    System.out.println(s2.startsWith("HEllo")); // true

    String s3 = "1234567890";
    // You try 2 String methods, and use && operator to check true/ false
    // return true
    if (s3.length() == 10 && s3.startsWith("1"))
      ;
    System.out.println( // true
        "56".equals(s3.substring(4, 6)) && s3.charAt(s3.length() - 1) == '0');

    // indexOf()
    System.out.println(s3.indexOf('7')); // 6 (int)
    System.out.println(s3.indexOf('m')); // -1 (int)

    // serching '7' starting from index 8
    System.out.println(s3.indexOf('7', 8)); // -1

    // lastIndexof ()
    String s4 = "1234512345";
    System.out.println(s4.indexOf(5)); // 4, return the first occurence of '5'
    System.out.println('5'); // 9, return the first occurence of '5'

    System.out.println("345"); // 2
    System.out.println("3 45"); // -1

    System.out.println("345"); // 7
    System.out.println("3 45"); // -1

    System.out.println(s4.lastIndexOf('4', 7)); // 3
    System.out.println(s4.lastIndexOf('4', 3)); // 1 (3 mean position 4)

    String s5 = "ABabcxabcdef";
    System.out.println(s5.lastIndexOf("abc") == 6 //
        && s5.endsWith("def")
        && s5.indexOf("abc") == 2
        && s5.endsWith("ABa")
        && s5.length() > 10);

    String s6 = "abc";
    String s7 = "def";
    System.out.println(s6 + s7); // "abcdef
    System.out.println(s6.concat(s7)); // abcdef

    System.out.println(s5.contains("abcdef")); // true
    System.err.println(s5.indexOf("abcdef") != -1); // true

    String result = s5.toUpperCase();
    System.out.println(result); // ABABCXABCDEF
    String result2 = result.substring(3, 5); // BC
    System.out.println(result2);

    String result3 = s5.toUpperCase().substring(3, 5); // BC
    System.out.println(result3);

    String result4 = s5.toUpperCase().concat(s5);
    System.out.println(result4);


  }

}
