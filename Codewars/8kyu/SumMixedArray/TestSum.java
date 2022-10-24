import java.util.Arrays;

public class TestSum {
    public static void main(String[] args) {
        MixedSum test = new MixedSum();
        int output = test.sumValues(Arrays.asList("5", 10, "15"));
        System.out.println(output);
    }
}
