import java.util.Deque;
import java.util.LinkedList;

public class Demo {

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator(100);
    c.add(5);
    System.out.println(c.getX()); // 105

    Calculator calculator = new Calculator();

    Deque<String> deque = new LinkedList<>();
    deque.push(null);
  }

}
