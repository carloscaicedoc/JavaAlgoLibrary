/* Codewars 8kyu Invert Values 

Given a set of numbers, return the additive inverse of each. 
Each positive becomes negatives, and the negatives become positives.
*/
import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        int[] inv = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inv[i] = -array[i];
        }        
        return inv;
    }
    // Array.stream().map - approach
    public static int[] invertStream(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}