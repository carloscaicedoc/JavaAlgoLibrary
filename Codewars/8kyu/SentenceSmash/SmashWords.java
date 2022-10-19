/* Codewars 8kyu Sentence Smash

Write a function that takes an array of words and smashes them together 
into a sentence and returns the sentence. 
You can ignore any need to sanitize words or add punctuation, 
but you should add spaces between each word. 
Be careful, there shouldn't be a space at the beginning or the end of the sentence!
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmashWords {
    public static String smash(String... words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                sentence += words[i] + " ";
            } else if (i == words.length - 1) {
                sentence += words[i];
            }
        }
        return sentence;
    }

    // .join()
    public static String smashJoin(String... words) {
        return String.join(" ", words);
    }

    // String Builder
    public static String smashStringBuilder(String... words) {
        if (words == null)
            return null; // nothing to do
        if (words.length == 0)
            return ""; // nothing to do

        StringBuilder sb = new StringBuilder();
        String separator = " ";
        int maxCount = words.length - 1; // last one will be added outside of the loop

        for (int i = 0; i < maxCount; i++) {
            sb.append(words[i] + separator);
        }
        sb.append(words[maxCount]);

        return sb.toString();
    }

    // .trim()
    public static String smashTrim(String... words) {
        String s = "";
        for (String st: words){
          s += st + " ";
        }
        return s.trim();
    }
     
    // .stream().collect()
    public static String smashStream(String... words) {
        return Arrays.stream(words).collect(Collectors.joining(" ")).trim();
    }
}
