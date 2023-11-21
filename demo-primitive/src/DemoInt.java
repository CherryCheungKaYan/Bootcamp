
public class DemoInt {
    public static void main(String[] args) {
        // " " String
        // number
    System.out.println("2 abc");
    System.out.println(2);
    System.out.println(2.3);

    // monthlySalary and I are both "variable"變量"
    // int monthlySalary = 20000;
    // int i = 2;

    // "int age -> Declaration, int -> integer"
    // age = 30 -> Assignemnt, assign the interger value 30 to the valuable 
    // int age = 30;

    int level; //Declaration
    level = 1; //Assigement
    level = 10; //Re-assigemnt 
    // int level; // We cannot re-declare the same variable

    // Step 1: level = 10+3; (because level = 10 beofre reaching this line)
    // Step 2: level = 13
    // level = level + 3; //13
    // level += 3; // 16

    // level = level - 7; //9
    // level -= 7; //2

    // level = level*3; //6
    // level *= 3; //18

    // level = level/ 2; //9
    // level /= 2; //4
    // System.out.println(level); //4

    // level = level + 1;//5
    // level++; //6
    // ++level; //6

    // level--; //5
    // --level; //4

    // the remineder of 5 / 2 -> 1
    int remainder = 5 % 2; //1
    System.out.println(remainder); //1

    int result = (5 + 3) / 2 % 3;
    System.out.println("result=" + result); //1

    result = 5 + 3 / 2 % 3;
    System.out.println("result=" + result); //6.0

    result = 6 + 7 * 2 % 5; //10
    System.out.println(result);

    result = 6 + 7 % 2 * 5; //11
    System.out.println("result=" + result);
    


    // byte, short, int, long (primitive)
    byte b = -128; // -128 to 127
    byte b2 = 127;
    // byte b3 = 128; 128 is out of range of integer value that can be stored 

    short s = -32768;
    short s2 = 32767;
    // short s3 = 32768

    // int range (-2147483648 to 2147483647)
    int i1 = -2147483648;
    int i2 = 2147483647;
    // int i3 = 2147483648;
    
    // long l0 = 2147483648; // 2147483648 is int presentation, but out range of int.
    long l1 = -9223372036854775808L; // notation L -> long value
    int i5 = 100; // The value 100 has no notation -> default it is an int value
    byte b4 = 100; // Java implicitly convert the int to byte
    short s4 = 100; // Java

    l1 = l1 + 10L;
    System.out.println(l1); //-9223372036854775798

    int form;
    form = 1;
    System.out.println(form);

    int good;
    good = 100;
    System.out.println(good);

    int bad;
    bad = 0;
    System.out.println(bad);

    int beauty;
    beauty = 1000000;
    System.out.println(beauty);

    }
}
