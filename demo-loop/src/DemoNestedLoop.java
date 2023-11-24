public class DemoNestedLoop {

  public static void main(String[] args) {
    // for (int = 0; i < 5; i++) { //0,1,2,3,4
    // // System.out.println("i=");
    // System.out.println("*");
    // }
    // *****

    for (int i = 0; i < 4; i++) { // 52 weeks //outerloop
      System.out.println("Hello!!!!, i=" + i);
      for (int j = 0; j < 3; j++) { // 7 days //innerloop
        if (i > 1 && j > 1) {
          break;
        }
        System.out.println("World!, j=" + j);
      }
    }

    // i < 5
    // j < 4
    for (int i = 0; i < 5; i++) { // row becasue you add printLn()
      for (int j = 0; j < 4 - i; j++) { // column -> variable length
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("Example 3:");
    String str = "abcdefghijk";
    int count = 0;
    for (int i = 0; i < str.length(); i++) { // length
      // nested loop, 4 character in a row
        System.out.print(str.charAt(i)); {
        if (++count % 4 == 0 || i == str.length() - 1) { // either 1 will be executed
         System.out.println("");
        }
      }
       
      }
    }

}  

      



  
