/* Codewars 8Kyu Even or Odd

Create a function that takes an integer as an argument 
and returns "Even" for even numbers or "Odd" for odd numbers.
*/

public class EvenOrOdd {
    // Ternary Operator
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
    
    public static String evenOrOdd2(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
