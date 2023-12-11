public class Leetcode2114 {

  // Input: sentences = ["alice and bob love leetcode", "i think so too", "this is
  // great thanks very much"]
  // Output: 6
  class Solution {
    public int mostWordsFound(String[] sentences) {

      int maxWords = 0;
      int count = 0;

      for (String sentence : sentences) {
        String[] words = sentence.split(" "); // space delimiter
        int wordCount = words.length; // count the no. of words in the sentencs

        if (wordCount > maxWords) {
          maxWords = wordCount;
          count = 1;
        } else if (wordCount == maxWords) {
          count++;
        }
      }
      return count;
    }
  }
}
