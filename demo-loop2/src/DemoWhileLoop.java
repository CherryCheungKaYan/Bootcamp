import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {

        // int sum = 0;
        // for (int i = 0; i < 5; i++) {
        // sum += i;
        // }
        // System.out.println("sum=" + sum);

        // int j = 0;
        // sum = 0;
        // while (j < 5) {
        // System.out.println("check before j : " + j);
        // sum += j++;
        // // sum = sum + j++;
        // System.out.println("check sum : " + sum);
        // System.out.println("check after j : " + j);

        // }
        // System.out.println("sum=" + sum + ", j =" + j);
        // // contiune , break
        // // print odd numbers and <= 5
        // j = 0;
        // while (++j <= 10) {
        // if (j > 5)
        // break;
        // if (j % 2 == 0)
        // continue;
        // System.out.println(j);
        // }

        // int x = 10;
        // int y = 5;
        // while (x > 0 && y > 0) {
        // System.out.println("x=" + x + ", y=" + y);
        // y--;
        // x--;
        // }

        // 1 1 2 3 5 8 13 ...<1000
        // int a2 = 0;
        // int a1 = 1;
        // int e = -1;
        // int[] arr = new int[20];
        // int idx = 0;
        // System.out.println("idx0 : " + idx);
        // arr[idx++] = a2; // idx = 0
        // // arr[0]=a2;
        // // idx++ -> 1
        // System.out.println("idx : " + idx);
        // arr[idx++] = a1; // idx = 1
        // System.out.println("idx2 : " + idx);
        // while (e < 1000) {
        // e = a1 + a2;
        // a2 = a1;
        // a1 = e;
        // arr[idx++] = a1;
        // }
        // System.out.println(Arrays.toString(arr));
        // // Approach 2:
        // a2 = 0;
        // a1 = 1;
        // e = -1;
        // while (true) {
        // e = a1 + a2;
        // if (e > 1000) {
        // e -= a2;
        // break;
        // }
        // a2 = a1;
        // a1 = e;
        // }
        // 2. Insertion Sort
        int j;
        int key;
        int[] arr2 = new int[] { 100, -30, 22, 44, -40 };
        for (int i = 1; i < arr2.length; i++) { // start from the 2nd element
            key = arr2[i]; // current element
            System.out.print("key=" + key);
            j = i;
            System.out.println(" " + "j=" + j);
            while (j > 0 && arr2[j - 1] > key) {
                arr2[j] = arr2[j - 1];
                j--;
            }
            arr2[j] = key;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
