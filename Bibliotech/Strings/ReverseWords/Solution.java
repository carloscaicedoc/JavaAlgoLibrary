// import java.util.*;

class Solution {
    public String reverseWords(String str) {
        String[] words = str.split(" ");
        String wordsReversed = "";

        for (String word : words) {
            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            if (wordsReversed.length() > 0) {
                reversedWord = " " + reversedWord;
            }
            wordsReversed += reversedWord;
        }

        return wordsReversed;
    }

}