
public class Solution {
    public static int squareSum(int[] n) {
        int sum = 0; 
        for (int num : n) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }
}
