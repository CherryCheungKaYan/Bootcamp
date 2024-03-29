public class DemoForLoop {
  public static void main(String[] args) {

    int x = 2;

    // counter initialization ; counter's continue condition ; counter's movement
    // Step 1: int i = 0;
    // Step 2: i < 4 ?? i is 0
    // Step 3: Yes -> x*=2
    // Step 4: sysout
    // Step 5: i++
    // Step 6: i < 4 ?? i is 1
    // Step 7: Yes -> x*=2
    // Step 8: sysout
    // Step 9: i++
    // Step 10: i < 4 ?? i is 2
    // Step 11: Yes -> x*=2
    // Step 12: sysout
    // Step 13: i++
    // Step 14: i < 4 ?? i is 3
    // Step 15: Yes -> x*=2
    // Step 16: sysout
    // Step 17: i++
    // Step 18: i < 4 ?? i is 4
    // Step 19: No -> exit loop

    for (int i = 0; i < 4; i++) { // 0,1,2,3
      x *= 2;
      System.out.println("x=" + x);
    }

    // x *= 2;
    // System.out.println("x=" + x);
    // x *= 2;
    // System.out.println("x=" + x);
    // x *= 2;
    // System.out.println("x=" + x); // 32

    // 0 + 1 + 2 + 3 + 4 + ... + 10 -> total
    int total = 0;
    for (int i = 0; i < 11; i++) {
      total += i;
    }
    System.out.println("total=" + total); // 55

    // 0 + 2 + 4 + ... + 10 -> total
    total = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        total += i;
      }
    }
    System.out.println("total=" + total); // 30

    // 0 - 100
    // i) 0 - 50, odd -> sum1
    // ii) 51 - 100, even -> another sum2
    // total -> sum1 * sum2
    total = 0;
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < 101; i++) { // 0,1,2,3,4...100
      if (i < 51) {
        if (i % 2 == 1) {
          sum1 += i;
        }
      } else {
        if (i % 2 == 0) {
          sum2 += i;
        }
      }
    }
    total = sum1 * sum2;
    System.out.println("total=" + total);

    // continue
    // sum up all odd number (0-100)
    int sum = 0;
    for (int i = 0; i < 101; i++) { // 0,1,2,3,4..100
      // skip even number: continue
      if (i % 2 == 0) {
        continue; // Go to the next iteration, skip the rest of codes
      }
      // For even number, the following code will be skipped
      sum += i;
    }
    System.out.println("sum=" + sum);

    // break -> exit the loop directly
    for (int i = 0; i < 4; i++) {
      if (i == 2) {
        break;
      }
      System.out.println("i=" + i);
    }
    // i=0
    // i=1

    // continue -> Go to the next iteration of i
    for (int i = 0; i < 4; i++) {
      if (i == 2) {
        continue;
      }
      System.out.println("i=" + i);
    }
    // i=0
    // i=1
    // i=3

    // Sum up odd numbers from 0 (0-100) before the sum reaching 200
    // Finally, the sum must be <= 200
    // The loop should be ended at which number of i?
    // System.out.println("i=" + i + ",sum=" + sum);
    int m = 0;
    int num = 0;
    for (int i = 0; i < 101; i++) {
      // skip even number
      if (i % 2 == 0) {
        continue;
      }
      // add up odd number
      m += i;
      // check if sum > 200, if yes, exit loop
      if (m > 200) {
        m -= i;
        break;
      }
      num = i;
    }
    System.out.println("sum=" + m + ", i=" + num);

    String str = "abc pol ijk def xyz";
    char target = 'z';
    int n = 0;
    boolean isFound = false;
    for (int i = 0; i < str.length(); i++) { // charAt(i)
      if (str.charAt(i) == target) {
        n = i + 1;
        isFound = true;
        break;
      }
    }
    if (isFound) { // found == true
      System.out.println("Found " + target + " at the " + n + "th character");
    } else {
      System.out.println("Not found");
    }



  }
}
