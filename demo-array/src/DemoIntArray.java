public class DemoIntArray {
    public static void main(String[] args) {
        // int age1 = 20;
        // int age2 = 25;
        // int age3 = 30;
        // int age4 = 28;

        // // Define an array (container) to store a list of int number
        // // This array (container) can only store int number
        // int[] arr = new int[9]; //{length of array}, by index 0-8
        // // assignemnt
        // arr[8] = 100;
        // System.err.println("arr[8]" + arr[8]); //20
        // arr[3] = 40;

        // // arr[9]=28; // error, no index 9 in array arr

        // int a; // local variable
        // a = 1; // explicitly assignment
        // System.out.println(a);
        // int [] arr2 = new int [5];
        // int [] arr3 = new int [] {100, 5, 30, 9, -40};
        // double [] arr4 = new double [] {1.2, 4.9, 5.6, 23.0};

        // System.out.println(arr2.length); //5

        // arr2 = new int [10];
        // System.out.println(arr2.length); //10

        // char [] arr5 = new char [] {'a', 'b', 'c'};
        // System.out.println(arr5);

        // String [] cars = new String [] {"BMW", "Ford", "Volvo"};
        // System.out.println(cars[0]);

        // boolean [] b1 = new boolean [] {true, false};
        // // System.out.println("The array is:");
        // for (boolean value: b1) {
        // System.out.println("Value =" + value);
        // }

        // array supports for loop

        // int b = 100;
        // b = 1000;
        // System.out.println(b);

        // // default value of int []
        int[] arr5 = new int[3];
        for (int i = 0; i < arr5.length; i++) {
            // // arr5 is storing the address of the array object
            // // we use arr5[5] find out the 3 values stored int he array object
            arr5[i] = i + 1;
            System.out.println("arr3[i]=" + arr5[i]);
        }
        
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.println(arr5[i]);
            if (i > 0) {
                System.out.println(" ");
            }
        }

        // String str = "hello"; // str is storing the address of String object hello
        // String str2 = new String("hello");
        // String str3 = String.valueOf("hello");

    }
}
// 8 primtives + String
// char []
// boolean []
// String []
// arrays supprts for loop
