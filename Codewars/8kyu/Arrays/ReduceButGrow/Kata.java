/* Codewars 8kyu Reduce but Grow

Given a non-empty array of integers, 
return the result of multiplying the values together in order. 
Example:
[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/

import java.util.stream.IntStream;
import java.util.*;

public class Kata {
    public static int grow(int[] x) {
        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }

    // Alternative Solutions: 
    
    // Enhanced Loop
    public static int growEnhanced(int[] x) {
        int result = 1;
        for (int n : x) {
            result *= n;
        }
        return result;
    }

    // IntSream.of() & reduce()
    public static int growIntStream(int[] x) {
        return IntStream.of(x).reduce(1, (a, b) -> a * b);
    }

    // Arrays.stream() & reduce()
    public static int growArrays(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }

    // While loop
    public static int growWhileLoop(int[] x) {
        int prod = 1;
        int i = 0;
        while (i < x.length) {
            prod *= x[i];
            i++;
        }
        return prod;
    }
}