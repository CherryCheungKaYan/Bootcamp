public class Leetcaode2011 {

  // Input: operations = ["X++","++X","--X","X--"]
  // Output: 0
  // Explanation: The operations are performed as follows:
  // Initially, X = 0.
  // X++: X is incremented by 1, X = 0 + 1 = 1.
  // ++X: X is incremented by 1, X = 1 + 1 = 2.
  // --X: X is decremented by 1, X = 2 - 1 = 1.
  // X--: X is decremented by 1, X = 1 - 1 = 0.
  public static int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (String operation : operations) {
      if (operations.equals("x++") ||operations.equals("++X")){
        x++;
      } else if(operations.equals("X--") ||operations.equals("--X")){
        x--;
      }

  }    return x;
  }

  public static void main(String[] args) {
   String[] operations = {"X++","++X","--X","X--"};
    int finalValue = finalValueAfterOperations(operations);
    System.out.println(finalValue);
  }
}
