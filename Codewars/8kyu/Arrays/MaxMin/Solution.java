/* Codewars 8kyu Find Maximun & Minimun 

Your task is to make two functions ( max and min, or maximum and minimum, etc., 
depending on the language ) that receive a list of integers as input, 
and return the largest and lowest number in that list, respectively.
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int min(int[] list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            min = num < min ? num : min;
        }
        return min;
    }
    public int max(int[] list) {
        int max = list[0];
        for (int num : list) {
            max = num > max ? num : max;
        }
        return max;
    }
    
    // Sorting
    public int minSort(int[] list) {
        Arrays.sort(list);
        return list[0];
    }
    public int maxSort(int[] list) {
        Arrays.sort(list);
        return list[list.length-1];
    }
    
    // Stream.IntStream
    public int minStream(int[] list) {
        return IntStream.of(list).min().getAsInt();
    }
    public int maxStream(int[] list) {
        return IntStream.of(list).max().getAsInt();
    }
}