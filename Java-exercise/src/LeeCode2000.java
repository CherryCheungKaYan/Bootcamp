
// Input: word = "abcdefd", ch = "d"
// Output: "dcbaefd"

// Input: word = "xyxzxe", ch = "z"
// Output: "zxyxxe"

// Input: word = "abcd", ch = "z"
// Output: "abcd"

public class LeeCode2000 {

    public static String reversePrefix(String word, char ch) {
        int endIndex = word.indexOf(ch);

        if (endIndex == -1) {
            return word; // Character not found in the word
        }

        StringBuilder reversedSegment = new StringBuilder();

        for (int i = endIndex; i >= 0; i--) {
            reversedSegment.append(word.charAt(i));
        }

        reversedSegment.append(word.substring(endIndex + 1));

        return reversedSegment.toString();
    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';

        String reversedWord = reversePrefix(word, ch);
        System.out.println(reversedWord);
    }
}
