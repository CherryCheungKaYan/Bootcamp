public class Practice {
  public static void main(String[] args) {

    // for (int i = 0; i < 4; i++) {
    // System.out.println("I love You!");
    // }

    // for (int i = 0; i <= 6; i++) {
    // System.out.println(i);
    // }

    // int [] grades = {34, 78, 90, 45};
    // for (int i = 0 ; i < grades.length; i++) {
    // System.out.println(grades[i]);

    // int maxNum = 5;
    // for (int i = 1; i <= maxNum; i++) {
    // System.out.println(i);
    // }

    // int sum = 0;
    // for (int i = 1; i<= 10; i++) {
    // sum+= i;
    // }
    // System.out.println(sum) ;

    // int sum2 = 10;
    // for (int i = 1; i < 5; i++) {
    // sum2 -= i;
    // System.out.print(i + " ");
    // System.out.println(sum2);

    // }

    // for (int i = 1; i < 3; i++) {
    // System.out.println("outer:" + i);
    // for (int j = 1; j <= 4; j++) {
    // System.out.println("Inner = " + j);
    // }
    // }

    // for (int i = 0; i<5; i++) {
    // System.out.println("Yes");
    // }

    // for (int i = 0; i <= 3; i++) {
    // for (int j = 0; j <= 3; j++) {
    // if (i * j == 6) {
    // break;
    // }
    // }
    // }
    // System.out.println("i:" + i + ", j: " + j);

    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= 10; j++) {
    // if (i * j == 10) {
    // break;
    // }
    // System.out.println("i:" + i + ", j: " + j);
    // }
    // }

    // String str = "abc pol ijk def xyz";
    // char target = 'z';
    // int n = 0;
    // boolean isFound = false;
    // for (int i = 0; i < str.length(); i++) { // charAt(i)
    // if (str.charAt(i) == target) {
    // n = i + 1;
    // isFound = true;
    // break;
    // }
    // }
    // if (isFound) { // found == true
    // System.out.println("Found " + target + " at the " + n + "th character");
    // } else {
    // System.out.println("Not found");

    // String str = "i love sunny day";
    // char target = 'n';
    // int n = 0;
    // boolean isFound = false;

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == target) {
    // n = i + 1;
    // isFound = true;
    // break;
    // }
    // }
    // if (isFound) { // found == true
    // System.out.println("Found " + target + " at the " + n + "th character");
    // } else {
    // System.out.println("Not found");

    // }

    // String i = "cherry";
    // char result = i.charAt(1);
    // System.out.println(result);
    // ;

    // String j = "giovanna";
    // char result2 = j.charAt(5);
    // System.err.println(result2);

    // int time = 20;
    // if (time < 22) {
    // System.out.println("it is a good morning");
    // } else {
    // System.out.println("it is a good evening");
    // }

    // int[] grades = { 89, 43, 78, 90 };
    // for (int i = 0; i < grades.length; i++); {
    // System.out.println(grades[i]);

    // int day = 4;
    // switch (day) {
    // case 1:
    // System.out.println("Monday");
    // break;
    // case 2:
    // System.out.println("Tuesday");
    // break;

    // int month = 3;
    // switch (month) {
    // case 1:
    // System.err.println("Jan");
    // break;
    // case 2:
    // System.err.println("Feb");
    // break;
    // default:
    // System.out.println("Looking forward");
    // }

    // String serachMe = "peter piper picked a peck of pickled peppers";
    // int num = 0;

    // for (int i = 0; i < serachMe.length(); i++) {
    // if (serachMe.charAt(i) != 'p') {
    // continue;
    // }
    // ++num;
    // }
    // System.out.println("Found" + num + "p's in the string.");

    // String s1 = "i love my kids very much.";
    // int count = 0;
    // for (int i = 0; i < s1.length(); i++) {
    // if (s1.charAt(i) != 'y') {
    // continue;
    // }
    // count++;
    // }
    // System.out.println("Found" + count + "y's in the string.");

    String name = "Cherry";
    // boolean result = name.equalsIgnoreCase("Cherry");
    // int result = name.length();
    // char result = name.charAt(0);
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase();
    // String result = name.trim();
    String result = name.replace('e', 'a');

    System.out.println(result);

  }
}

// No "-", "*", "/" in String
// String supports "+", "+="
