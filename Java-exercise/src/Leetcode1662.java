public class Leetcode1662 {

  // Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
  // Output: true
  // Explanation:
  // word1 represents string "ab" + "c" -> "abc"
  // word2 represents string "a" + "bc" -> "abc"
  // The strings are the same, so return true.
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (String word : word1) {
      sb1.append(word);
    }
    for (String word : word2) {
      sb2.append(word);
    }
    String str1 = sb1.toString();
    String str2 = sb2.toString();
    return str1.equals(str2);
  } 


}
