/* Codewars 8kyu Messi Goals Function

Messi is a soccer player with goals in three leagues:
- LaLiga
- Copa del Rey
- Champions
Complete the function to return his total number of goals in all three leagues.
Note: Input will always be valid.

Example: 
5, 10, 2  -->  17
*/
import java.util.Arrays;

public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        int totalGoals = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
        return totalGoals;
    }
    
    // Alternative Solutions
    
    // Arrays.stream()
    public static int goalsStream(int...array) {
        return Arrays.stream(array).sum(); 
    }

    // Arrays.stream() 2
    public static int goalsStream2(int l, int c, int ch) {
        int[] goalBoard = {l, c, ch};
        return Arrays.stream(goalBoard).sum(); 
    }

    // Functional Programming
    public static int goalsAsList(int l, int cr, int ch) {
        return Arrays.asList(l, cr , ch)
            .stream().reduce(0, (s, g) -> s + g);
    }
    
    // In case that input is negative
    public static int goals4(int l, int c, int ch) {
        int sum = 0;
        if (l < 0 || c < 0 || ch < 0 ) {
            System.out.print("Invalid number! Goals can not be a negative value.\n");
            return 0;
        } else  {
            sum = l + c + ch;
        }
        return sum;
    }
}
