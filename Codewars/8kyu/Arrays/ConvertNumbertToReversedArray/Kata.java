/* Codewars 8kyu Convert Number to Reversed Array of Digits

Given a random non-negative number, 
return the digits of this number within an array in reverse order.

Example:
35231 => [1,3,2,5,3]
*/

public class Kata {

    public static int[] digitize(long n) {
        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }

        System.out.println(nums);

        return result;
    }
}
