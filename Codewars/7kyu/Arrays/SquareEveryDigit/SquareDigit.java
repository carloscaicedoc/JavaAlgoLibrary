/* CodeWars 7kyu - Square Every Digit

In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
Note: The function accepts an integer and returns an integer
*/
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        String res = "";
        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            int dgt = Integer.parseInt(String.valueOf(digit));
            int sq = dgt * dgt;
            res += Integer.toString(sq);
        }
        return Integer.parseInt(res);
    }

    /* Alternative Solutions */ 
    // .map() approach
    public int squareDigitsMap(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    // .toCharArray()
    public int squareDigitsCharArray(int n) {
        String strDigits = String.valueOf(n);
        String result = "";

        for (char c : strDigits.toCharArray()) {
            int digit = Character.digit(c, 10);
            result += digit * digit;
        }
        return Integer.parseInt(result);
    }

    // StringBuffer approach
    public int squareDigitsStringBuffer(int n) {
        // Use StringBuffer due to performance
        final StringBuffer result = new StringBuffer();
        int x = 0;
        // As long as we have digits left.
        while (n > 0) {
            // Take the next digit (we are in the decimal system).
            x = n % 10;
            // Delete this digit.
            n = n / 10;
            // Insert at the first position is necessary otherwise we would get a wrong
            // order.
            result.insert(0, x * x);
        }
        return Integer.parseInt(result.toString());
    }
    
    // StringBuilder approach
    public int squareDigitsStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);
        for (char c : num.toCharArray()) {
            int curr = c - '0';
            curr *= curr;
            sb.append(curr);
        }
        return Integer.valueOf(sb.toString());
    }
}