/* CodeWars 7kyu Vowel Count

Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
*/
import java.util.List;
import java.util.Arrays;

public class Vowels {
    public static int vowelCount(String str) {
        int count = 0; 
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
                count++;                
            }
        }
        return count;
    }

    // .Contains() approach
    public static int vowelCountContains(String str) {
        int count = 0; 
        String vowelString = "aeiou";
        
        for (int i = 0; i < str.length(); i++) {
            String currLetter = String.valueOf(str.charAt(i));
            if (vowelString.contains(currLetter)) {
                count++;                
            }
        }
        return count;
    }
    
    public static int vowelCountToCharArray(String str) {
        int count = 0; 
        for (char c : str.toCharArray()) {
            count += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        }
        return count;
    }
    
    // .filter() .indexOf() approach
    public static int vowelCountIndexOf(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
    
    // switch() approach
    public static int vowelCountSwitch(String str) {
        int count = 0; 
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                count++;
            }
        }
        return count;
    }
    
    // Arrays.asList() solution
    private static List<Character> vwls;
    
    static {
        vwls = Arrays.asList('a', 'e', 'i', 'o', 'u');
    }

    public static int vowelCountList(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vwls.contains(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
