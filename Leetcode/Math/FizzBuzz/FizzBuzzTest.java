import java.util.ArrayList;

public class FizzBuzzTest {
    public static void main(String[] args) {

        Solution fizzBuzzApp = new Solution();
        ArrayList<String> fizzBuzzList = fizzBuzzApp.fizzBuzz(30);
        for (int i = 0; i < fizzBuzzList.size(); i++) {
            System.out.println(fizzBuzzList.get(i));
        }
    }
}
