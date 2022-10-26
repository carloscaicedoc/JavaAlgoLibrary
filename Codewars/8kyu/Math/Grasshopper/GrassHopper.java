import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {
      int sum = 0; 
      for (int i = 1; i <= n; i++) {
        sum += i;
      }
        return sum;
    }

    // Math formula
    public static int summation2(int n) {
        return n * (n + 1) / 2;
    }

    // IntStream
    public static int summation3(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

    // While loop
    public static int summation4(int n) {
        int sum = 0; 
        int i = 1;
        while (i <= n) {
            sum += i; 
            i++;
        }
        return sum;
    }
}