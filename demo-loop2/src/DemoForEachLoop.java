import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] { 100, -30, 20 };

    for (Integer i : integers) {
      System.out.println("i=" + i);
    }

    for (int i = 0; i < integers.length; i++) {
      System.out.println("i=" + integers[i]);
    }
    String str = "abc,def,ijk,xyz";
    String[] parts = str.split(",");
    // for (int i = 0; i < integers.length; i++) {
    System.out.println(str);
    System.out.println(Arrays.toString(parts));
    for (String part : parts) {
      System.out.println(part);
    }
    // Example 1:
    String str2 = "abcdefghijk";
    // final string -> "acegik"
    int arrLength = str2.length() % 2 == 0 ? str2.length() / 2 : str2.length() / 2 + 1;
    char[] result = new char[arrLength];
    // how to declare an Array ?
    // 1. set lengh first
    // 2. input elements
    int idx = 0;
    char[] characters = str2.toCharArray();
    for (int i = 0; i < characters.length; i++) {
      if (i % 2 == 0) {
        result[idx++] = characters[i];

      }
    }
    // i = 0 , idx = 0
    // i = 1 , if ( 1 % 2 == 0 )= false, SKIP , idx keep is 0
    // i = 2 , idx++ -> idx = 1 , conclusion -> i = 2 , idx = 1
    // i = 4 , idx =2
    // i = 6 , idx =3 ..
    System.out.println("Final String=" + String.valueOf(result));

    // Example 2:
    // Given String "abcdefg"
    // finalString "gfedcba"
    System.out.println("Reversed String=" + reverse("abcdef")); // "fedcba"
    System.out.println("Reversed String=" + reverse("")); // ""
    System.out.println("Reversed String=" + reverse("abcde")); // "edcba"
  }

  public static String reverse(String s) {

    // String s = "abcdefg";
    char[] characters2 = s.toCharArray();
    char[] result2 = new char[s.length()];
    char temp = 0;
    // String str1 = temp.toString(); -> primitive no method

    for (int i = 0; i < characters2.length; i++) {
      // temp = result2[i];
      // result2[i] = characters2[i];
      // characters2[i] = temp;
      result2[i] = characters2[s.length()-1-i];
    
    }
    return String.valueOf(result2);
  }

}
