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

    String serachMe = "peter piper picked a peck of pickled peppers";
    int num = 0;

    for (int i = 0; i < serachMe.length(); i++) {
    if (serachMe.charAt(i) != 'p') {
    continue;
    }
    ++num;
    }
    System.out.println("Found" + num + "p's in the string.");

    String s1 = "i love my kids very much.";
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
    if (s1.charAt(i) != 'y') {
    continue;
    }
    count++;
    }
    System.out.println("Found" + count + "y's in the string.");

    String name = "Cherry";
    // boolean result = name.equalsIgnoreCase("Cherry");
    // int result = name.length();
    // char result = name.charAt(0);
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase();
    // String result = name.trim();
    // String result = name.replace('e', 'a');

    // System.out.println(result);

    // String str = "hello world";
    // // if (!str.isEmpty()) {
    // // System.out.println("String=" + str);
    // // }
    // // System.out.println(str.length());

    // for (int i = 0; i < str.length(); i++) {
    // if (i % 2 == 0) {
    // System.out.println(str.charAt(i));
    // }
    // }
    // System.out.println("");

    // String s = "hello";
    // String newStr = s.substring(2, 4);
    // System.out.println("newStr=" + newStr);
    // System.out.println(s.substring(0));

    // String s3 = "1234567890";
    // System.out.println(s3.length() == 10 && s3.startsWith("1"));
    // System.out.println(
    // "56".equals(s3.substring(4,6)) && s3.charAt(s3.length() -1) == '0');

    // System.out.println(s3.indexOf('7'));
    // System.out.println(s3.indexOf('7', 8));

    // System.out.println(s3.lastIndexOf('5'));

    String s5 = "ABabcxabcdef";
    // System.out.println(s5.lastIndexOf("abc"));
    // if (s5.length() > 20) {
    // System.out.println("s5=" + s5 );

    // String s6 = "abc";
    // String s7 = "def";
    // System.out.println(s6.concat(s7));
    // System.out.println(s6 + s7);

    // System.out.println(s5.indexOf("abcdef") != -1);

    // int[] arr2 = new int[5];
    // int[] arr3 = new int[] { 100, 5, 30, 9, -40 };
    // System.out.println(arr2.length);

    // arr2 = new int[10];
    // System.out.println(arr2.length);

    int[] arr5 = new int[3];
    // for (int i = 0; i < arr5.length; i++) {
    // arr5[i] = i + 1;
    // System.out.println("arr5[i]=" + arr5[i]);
    // }

     for (int i = arr5.length-1; i>=0; i--) {
    System.out.print(arr5[i]);
    if (i > 0) {
    System.out.println(" ");

//     int temp;
//  for (int i = 0; i < arr.length; i++) {
//       if (i == 0) {
//         // swapping
//         temp = arr[i];
//         arr[i] = arr[i + 1];
//         arr[i + 1] = temp;
      }
    }
    // System.out.println(Arrays.toString(arr));

    // int[] arr = new int[] { 10, 16, 8 };
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   sum += arr[i];
    // }
    // System.out.println("sum=" + sum);

    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] > max) {
    //     max = arr[i];
    //   }
    // }
    // System.out.println("max=" + max);

    // int min= Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] < min) {
        // min = arr[i];
      }
    }
    // System.out.println("min=" + min);



// No "-", "*", "/" in String
// String supports "+", "+="
