public class DemoDoWhileLoop {
  public static void main(String[] args) {
    int j = 0;

    while (j < 0) { // not fulfill
      // }
    }

    for (int i = 0; i < 0; i++) {

    }
    do {
      System.out.println("hello");
    } while (j < 0);

    while (++j < 5 ) {
      System.out.println("j=" + j);
    }
  }
}