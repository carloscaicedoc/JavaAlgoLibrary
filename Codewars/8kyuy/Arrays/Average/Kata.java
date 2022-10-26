/* Codewars 8kyu Calculate Average

Write a function which calculates the average of the numbers in a given list.
Note: Empty arrays should return 0.
*/

import java.util.stream.IntStream;

public class Kata {
    public static double calculateAverage(int[] array) {     
        if (array.length == 0) return 0;

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        
        return sum / array.length;
    }

    public static double averageStream(int[] array) {
        return IntStream.of(array).average().getAsDouble();
    }
}