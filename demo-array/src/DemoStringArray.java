import java.util.Arrays;

public class DemoStringArray {

  public static void main(String[] args) {
    // "abc "ijk" "xyz"
    String[] strings = new String[] { "abc", "ijk", "xyz" };

    // approach 2
    String[] strings2 = new String[3];
    strings2[0] = "abc";
    strings2[1] = "ijk";
    strings2[2] = "xyz";

    // for loop
    // strings[0] --> "abcijk"
    // strings[1] --> "ijkxyz"
    // strings[2] --> "xyz"

    for (int i = 0; i < strings.length; i++) { // 0,1,2
      if (i < strings.length - 1) {
        strings[i] = strings[i].concat(strings[i + 1]);
      } else {
        strings[i] = strings[i].concat("!");
      }
      System.out.println("Strings1 result : " + Arrays.toString(strings));
    }

    // approach 2
    for (int i = 0; i < strings2.length; i++) { // 0,1,2
      if (i < strings2.length - 1) {
        strings2[i] = strings2[i].concat(strings2[i + 1]);
        // i = 0 , strings2[0] = strings2[0].concat(strings2[0 + 1]);
      // i = 1, 1+1

        System.out.println(strings2[i]);
        continue;
      }
      strings2[i] = strings2[i].concat("!");
    }
    System.out.println("Strings2 result : " + Arrays.toString(strings2));
  }
}
// with continue : Strings2 result : [abcijk, ijkxyz, xyz!]
// without continue : Strings2 result : [abcijk!, ijkxyz!, xyz!]

// i =0 , 
 // i=1 , 