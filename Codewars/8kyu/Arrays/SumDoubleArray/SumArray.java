/* CodeWars 8kyu. Sum Arrays

Write a function that takes an array of numbers and returns the sum of the numbers. 
If the array does not contain any numbers then you should return 0.
The numbers can be negative or non-integer. 
*/

import java.util.Arrays;

public class SumArray {
    // Enhanced for-loop 
    public static double sum(double[] numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }
    
    // Stream().sum approach
    public static double sumStream(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
