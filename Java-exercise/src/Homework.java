public class Homework {
  public static void main(String[] args) {
    // String, Int, char
    // for (int i = 0; i < 10; i++) {
    // if (i == 5)
    // break;
    // System.out.println("i=" + i);
    // }
    // System.out.println("out of loop.");

    // int total = 0;
    // int sum1 = 0;
    // int sum2 = 0;

    // for (int i = 0; i < 101; i++) {
    // if (i < 51) {
    // if (i % 2 == 1) {
    // sum1 += i;
    // }
    // } else {
    // if (i % 2 == 0) {
    // sum2 += i;
    // }
    // }
    // }
    // total = sum1 * sum2;
    // System.out.println("total= " + total);

    // int sum = 0;
    // for (int i = 0; i < 101; i++) {
    // if (i % 2 == 0) {
    // continue;
    // }
    // sum += i;
    // }
    // System.out.println("sum=" + sum);

    // for (int i = 0; i < 4; i++) {
    // if (i ==2) {
    // break;
    // }
    // System.out.println("i=" + i);
    // }

    // for (int i = 0; i < 4; i++) {
    // if (i == 2) {
    // continue;
    // }
    // System.out.println("i=" + i);
    // }

    // int m = 0;
    // int num = 0;
    // for (int i = 0; i < 101; i++) {
    // if (i % 2 == 0) {
    // continue;
    // }
    // m += i;
    // if (m > 200) {
    // m -= i;
    // }
    // num = i;
    // }
    // System.out.println("sum=" + m + ", i=" + num);

    // String str = "abc pol ijk def xyz";
    // char target = '9';
    // int n = 0;
    // boolean isfound = false;
    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == target) {
    // n += i;
    // isfound = true;
    // break;
    // }
    // }
    // if (isfound) { // found == true
    // System.out.println("Found " + target + " at the " + n + "th character");
    // } else {
    // System.out.println("Not found");
    // }

    // String str = "www.apple.com";
    // boolean isequal = true;
    // boolean isnotequal = false;

    // if ("www.apple.com".equals(str)) {
    // System.out.println(isequal);
    // } else {
    // System.out.println(isnotequal);
    // }

    // String i = "asdjfhdjghrigdcvnk";
    // System.out.println(i.length());

    // String j = "ihehcjsknf";
    // System.out.println(j.length());

    // String str = "please find where find occurs.";
    // System.out.println(str.indexOf("s"));

    // String name = "iloveyou";
    // char ch = name.charAt(4);
    // System.out.println(ch);

    String str = " it is a good day.";
    char ch2 = str.charAt(7);
    System.out.println(ch2);

    int i = 13;
    if (i % 2 == 0) {
      System.out.println("even no");
    } else {
      System.out.println("odd no");

      int n = -13;
      if (n > 0) {
        System.out.println("positive");
      } else if (n < 0) {
        System.out.println("Negative");
      } else {
        System.out.println("zero");
      }

      int age = 20;
      int weight = 80;
      if (age>= 18) {
        if (weight>= 50) {
          System.out.println("You are Ok to donate blood");
        }
      }
      int day = 2;
      switch (day) {
      case 1: 
      System.out.println("Today is Saturday");
      break;
      case 2:
      System.out.println("Today is Sunday");
      break;
      default:
      System.out.println("looking forward to the weekend");
      }
    }
  }
}
