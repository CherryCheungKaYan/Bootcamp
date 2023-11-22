public class DemoOperator {
  public static void main(String[] args) {

//     int x = 2;
//     x++;
//     ++x;
//     x += 1;
//     x = x + 1; // 6

//     int c = 1;
//     int postIncrement = c;
//     c++;

//     // difference between a++ and ++a
//     int a = 5;
//     int preIncrement = ++a;
//     // a ->6 first, then preIncrement -> 6
//     // System.out.println("preIncrement=" + preIncrement); // 6
//     // System.out.println("a=" + a); // 6


//     int b = 5;
//     postIncrement = b++;
//     // 1. PUT THE VALUE OF B TO postIncrement => SO postIncrement JUST TAKE VALUE
//     // "5"
//     // 2. BUT RIGHT HAND SIDE STILL NEED TO DO B++ => 5+1 => 6 ,
//     // 3. FINALLY B WIL CHANGE THE VALUE ITSELF => B=6
//     // postIncrement -> 5, b ->6
//     System.out.println("postIncrement=" + postIncrement); // 5
//     System.out.println("b=" + b ); // 6

//     //Conditional Operators
//     // && || !
//     // Example 1 - AND
//     if (c ==2 &&  b == 4) {// && -> Both two conditions need to be fulfilled
//     // (c == 2) -> true
//     // (b == 4) -> false
//     // (true && false) -> false
//     System.out.println("yes"); //print
//     }
//     // Example 2 - OR
//     if (c ==2 &&  b == 4) {// && -> Either conditions be fulfilled
//     // (c == 2) -> true
//     // (b == 4) -> false
//     // (true || false) -> true
//     System.out.println("yes"); //print
//   } else {
//   System.out.println("no");
// }
//   // Example 3 AND OR
//   String h = "hello";
//   if (c == 2 && (b == 4 || "hello".equals(h))) {
//     // (c == 2 ) -> true
//     // (b == 4) -> false
//     // "hello".equals(h) -> (h) -> true
//     // (true && (false || true)) -> true
//   System.out.println("yes"); //print 
//  } else {
// System.out.println("no");
// }


//   // Example 3a AND OR
//   String h5 = "hello";
//   if (c == 2 && b == 4 || "hello".equals(h5)) {
//     // (c == 2 ) -> true
//     // (b == 4 ) -> false
//     // "hello".equals(h) -> (h) -> true
//     // (true && false || true)) 
//     // (false || true) -> true
//   System.out.println("yes"); //print 
//  } else {
// System.out.println("no");
// }

// // Example 4 - AND
// if (c == 1 && b == 6) {
//   // (c == 1 && b == 6)}
//   // (c == 1 ) -> false
//   // (b == 6) will not be executed
//   System.out.println("yes");
// }

// // Example 5 - AND OR
// if (c == 1 || b ==4 && "hello".equals(h)) {
//   // b == -> false
//   //"hello".equals(h) -> true
//   // c == 1 -> false 
//   // false || false && true
//   // false || fase 
//   // false 
//   System.out.println("example 5=yes");
// } else {}

// //Example 6 AND OR
// if (h.charAt(3) == 'e' || b == 6) {
//   // h.charAt(3) =='l'
//   // b == 6 -> true
//   // false || true
//   // true 
//   System.out.println("example 6=yes");
// }


// boolean -> && ||
boolean b1 = true && false;
// System.out.println("b1=" + b1); //false

boolean b2 = false;
boolean b3 = true;

// boolean result = b2 || b3;
// System.out.println("result=" + result); // true

// boolean result2 = b2 || b3 && b1;
// System.out.println("result=" + result2); //false 

// if (b1 == false) { //if b1 is false, it is correct
//   System.out.println("example 7=b1 is false"); //print
// }

// if (!b1) { //if b1 is false, it is correct 
//   System.out.println("example 7b=b1 is false");//print
// }

// if (b1 == true ) { // if b1 is true, no , so it will not print
//   System.out.println("example 8a=b1 is true"); //not print
// }

// if (b1) { // if b1 is true, no , so it will not print
//   System.out.println("example 8b=b1 is true"); //not print
// }

// int g = 0;
// if (b1 == false) {
//   g = 10; //
// }

// int k = b1 == false ? 10 : 0;
// System.out.println("k=" + k);

// if (b1 == false) {
//   k=10;
// } else {
//   k=0;
// } 
// System.out.println("k=" + k);
// if b1 is false, assign 10 to k, otherwise 0

// int a1 = 10;
// int a2 = 4;
// int min;
// if (a1>a2){
//   min=a2;
// } else {
//   min=a1;
// } System.out.println ("min=" + min);

// min = a1>a2 ? a2 : a1;
// System.out.println ("min=" + min);
 
// int number = 13;
// boolean isOdd;  
 
// if (number % 2 ==0){
//   isOdd=false;
// }
// else {
//   isOdd=true;
// }
// System.out.println("Odd number:" + isOdd); //Odd number: true

//Solution 1
double totalAmount = 0;
int itemTotal = 3001; //subtotal
// if itemTotal > 3000, No transportation fee, otherwise +3% transportation fee
double deliveryRate = 0.03;
double transportationFee = 0.0d;

if (itemTotal <= 3000) {
  transportationFee = itemTotal*deliveryRate;
} 
  totalAmount = itemTotal + transportationFee;
  System.out.println("Total Amount=" + totalAmount);

//Soulution 2
  deliveryRate = (itemTotal>3000)? 0 : (itemTotal*deliveryRate);
  totalAmount = itemTotal + transportationFee;
  System.out.println("Total Amount=" + totalAmount);
  }
}

