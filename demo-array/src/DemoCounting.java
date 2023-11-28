import java.util.Arrays;

public class DemoCounting {

  public static void main(String[] args) {
    int[] numbers = new int[] { 10, 2, 200, 2000, 2000, 2, 2,0 };
    //target : find which number is appear most
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println(max); // 2000
    System.out.println(min); // 2
    int[] counts = new int[max - min + 1];//00000....1 -> number 2000 appear
    //create a new array to count which number appear most

    for (int i = 0; i < numbers.length; i++) {//00000....1 -> number 2000 appear
      counts[numbers[i] - min]++;
      //i = 0 , numbers[i] -> 10 -0 = 10
      //counts[10] ++
    }
    // [1,3,5,7,9,1]
    // [1,0,1,0,1,0,1,0,1,0]
    // [2,0,1,0,1,0,1,0,1,0]


    int maxCount = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] != 0 && counts[i] > maxCount) {
        max = counts[i];
      }
    }
    System.out.println("Max count : " + maxCount);

    //

    String str = "abadcdgbdsjerthaaa";
    char maxChar = ' ';
    int maxCount2 = 0;
    int counts2[] = new int[26];
    for( int i = 0 ; i < str.length() ; i++){
      counts2[str.charAt(i)-'a']++;
    }
    System.out.println("counts2 : " + Arrays.toString(counts2));
    counts2['b' - 'a']++; // 1

    System.out.println("Max count=" + maxCount + ", char=" + maxChar);
  }
}
// [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]
// [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
//when i = 0 , base on counts2[str.charAt(i)-'a']++;
//-> counts2['a'-'a']++;
//-> counts2[0]++; 
// a appear 1 time
// [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// when i =1 
//-> counts2['b'-'a']++;
//-> counts2[1]++; 
// b appear 1 time
// [1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// when i =2 
//-> counts2['a'-'a']++;
//-> counts2[0]++; 
// a appear 2 time
// [2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]


    String str2 = "AFGDHJBVJHKGYHUIKJN";
    count[str2.charAt(i)-'A']++;


 



