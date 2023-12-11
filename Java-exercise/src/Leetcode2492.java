import java.util.ArrayList;
import java.util.List;

// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.


public class Leetcode2492 {

  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> indices = new ArrayList<>();
      for (int i = 0; i < words.length ; i++) {
        if (words[i].indexOf(x) != -1) {
            indices.add(i);
        }
      } return indices;

  }

  public static void main(String[] args) {
    String[] words = {"leet", "code"};
    char x = 'e';
    Leetcode2492 solution = new Leetcode2492();
    List<Integer> indices = solution.findWordsContaining(words, x);


    System.out.print("[");
    for (int i = 0; i < indices.size(); i++) {
      System.out.print(indices.get(i));
      if (i != indices.size() - 1) {
        System.out.print(",");
      }
    }
    System.out.println("]");
  }
}


