import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n) {
        int sum = 0; 
        for (int num : n) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }
    public static int squareSumStream(int[] n) {
        return Arrays.stream(n).map(num -> num * num).sum();
    }
}
