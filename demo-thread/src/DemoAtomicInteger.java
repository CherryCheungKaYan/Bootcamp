import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomicInteger {

  AtomicInteger atmInt;
  //Stringbuilder name; public 

  public DemoAtomicInteger() {
    this.atmInt = new AtomicInteger(); 
    // this.sb = new Stringbuilder
  }

  public static void main(String[] args) {
    DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();
    // Person p1 = new Person();
    //p1.name.append("x")
    
    demoAtomicInteger.atmInt.incrementAndGet();  //p1.getname() (object->varable->method)
    // int[] arr = new int[10];
    // System.out.println(arr.length); length is varaible

    int result = demoAtomicInteger.atmInt.incrementAndGet();
    System.out.println(result); // 2

    Runnable AtomicIncrement = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        demoAtomicInteger.atmInt.incrementAndGet();
      }
    };

    demoAtomicInteger.atmInt.set(0); // reset to 0
    Thread worker1 = new Thread(AtomicIncrement);
    Thread worker2 = new Thread(AtomicIncrement);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(demoAtomicInteger.atmInt.get()); // 2000000
  }
}
