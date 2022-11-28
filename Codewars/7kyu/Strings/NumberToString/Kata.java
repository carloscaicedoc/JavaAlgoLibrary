/* CodeWars 7kyu - Convert a Number to a String

Write a function that can transform a number (integer) into a string.
What ways of achieving this do you know?
Examples (input --> output):
123  --> "123"
999 --> "999"
-100 --> "-100"
*/

public class Kata {
    // Integer.toString()
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    // .valueOf()
    public static String numberToStringValueOf(int num) {
        return String.valueOf(num);
    }
    
    // .format
    public static String numberToStringFormat(int num) {
        return String.format("%d", num);
    }

    // alternative approach
    public static String numberToString3(int num) {
        return "" + num;
    }
}
