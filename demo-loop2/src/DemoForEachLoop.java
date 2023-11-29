import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i: integers) {
      System.out.println("i=" + i);
    }
 
    for (int i = 0 ; i < integers.length; i++ ) {
      System.out.println("i=" + integers[i]);
    }
    String str = "abc,def,ijk,xyz";
    String [] parts = str.split(",");
    //for (int i = 0; i < integers.length; i++) {
      System.out.println(str);
      System.out.println(Arrays.toString(parts));
    for (String part : parts) 
    { System.out.println(part);
    }
  }
}

