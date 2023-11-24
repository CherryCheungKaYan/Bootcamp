public class DemoForLoop {
    public static void main(String[] args) {

        // counter initalization ; counter's continute condition ; counter's movement
        // Step 1: int i = 0;
        // Step 2: 1 < 4 ?? i is 0
        // Step 3: Yes -> x*2
        // Step 4: sysout
        // Step 5: i++
        // Step 6: i < 4 ?? i is 1
        // Step 7: Yes -> x*2
        // Step 8: sysout
        // Step 9: i++
        // Step 10: i < 4 ?? i is 2
        // Step 11: Yes - > x*2
        // Step 12: sysout
        // Step 13: i++
        // Step 14: i < 4 ?? i is 3
        // Step 15: Yes - > x*2
        // Step 16: sysout
        // Step 17: i++
        // Step 18: i < 4 ?? i is 4
        // Step 19: No - > exit

        // int x = 2;
        // for ( int i = 0; i < 4; i++) { //0,1,2,3
        // x*= 2; // x = x * 2
        // System.out.print("i=" + i);
        // System.out.println(" x=" + x);
        // }

        // x = *= 2;
        // System.out.println("x=" + x);
        // x = *= 2;
        // System.out.println("x=" + x); //32
        // 0 + 1 + 2 + 3 + 4 +..... + 10 -> total
        // int total = 0;
        // // for (int i = 0; i < 11; i++) {
        // // total += i; // total = total + i
        // // }
        // // System.out.println("total=" + total); //55

        // // 0 + 2 + 4 + 6 + 8...+ 10 -> total
        // for (int i = 0; i < 11; i++) {
        // if (i % 2 == 0) {
        // total += i; // total = tatal + 1
        // }
        // }
        // System.out.println("total=" + total);

        // // 0 - 100,
        // // i) 0 - 50, odd - > sum1
        // // ii) 51 - 100, even - > sum 2
        // // iii) total - > sum1 * sum 2

        // // Soulution 1
        // total = 0;
        // int ans1 = 0;
        // int ans2 = 0;
        // for (int i = 0; i < 101; i++) { // 0,1,2,4....100
        // if (i <= 50 && i % 2 == 1) {
        // ans1 += i;
        // } else if (i > 50 && i % 2 == 0) {
        // ans2 += i;
        // }
        // }
        // System.out.println(ans1);
        // System.out.println(ans2);
        // total = ans1 * ans2;
        // System.out.println("total=" + total);

        // // Solution 2
        // total = 0;
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
        // System.out.println("total=" + total);

        // // continute
        // // sum up all odd number (0-100)
        // int sum = 0;
        // for (int i = 0; i < 5; i++) { // 0,1,2,3,4.. 100
        // // skip even number: continue
        // if (i % 2 == 0) {
        // continue; // Go to the next iteration, skip the rest of codes
        // }
        // // for even number, the following code will be skipped
        // sum += i;
        // }
        // System.out.println("sum=" + sum);

        // // break -> exit the loop directly

        // for (int i = 0; i < 10; i++) {
        // if (i == 5) {
        // break;
        // }
        // System.out.println("i=" + i);
        // }
        // // continute -> go to the next iteration of i
        // for (int i = 0; i < 10; i++) {
        // if (i == 5) {
        // continue;
        // }
        // System.out.println("i=" + i);
        // }
        // sum up all odd number (0-100)
        // i) sum <= 200
        // ii) The loop should be ended at which number of i?

        // System.out.println("i=" + i" ,"sum=" + sum );
        int m = 0; // 總數
        int round = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) { // skip even number
                continue;
            }
            m+=i; // add odd number m = m + i
            // check if sum >, if yes, exit loop
            if (m > 300) {
                m -= i; // m = m - i  //196 = 225-29
                break;
            }
            round = i;
       
       //     System.out.println("sum=" + m + ", i=" + i);
        }
   System.out.println("sum=" + m + ", i=" + round);

        String str = "abc pol ijk def xyz";
        char target = 'f';
        int n = 0;
        boolean isFound = false;

        for (int i = 0; i < str.length(); i++) { // charAt(i)
            if (str.charAt(i) == target) {
                n = i + 1;
                isFound = true;
                break;
            }
        }
        if (isFound) { // found = true
            System.out.println("Found " + target + " at the " + n + "th character");
        } else {
            System.out.println("Not found");
        }
    }
}
