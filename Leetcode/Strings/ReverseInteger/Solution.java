/* LeetCode 7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the 
signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

public class Solution {
    public int reverseInt(int x) {
        int rev = 0;
        
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10) && pop > 7) {
                return 0;
            } 
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10) && pop < -8) {
                return 0;
            } 
            rev = rev * 10 + pop;
        }

        return rev;
    }

    public int reverseInt2(int x) {
        String str = "" + x;
        String reverseNumber = "";
        int ans;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                continue;
            } else {
                reverseNumber = str.charAt(i) + reverseNumber;
            }
        }

        if (x < 0) {
            reverseNumber = "-" + reverseNumber;
            ans = Integer.parseInt(reverseNumber);
        } else {
            ans = Integer.parseInt(reverseNumber);
        }
        
        if (ans >= (Math.pow(2, 31)) || ans < (Math.pow(-2, 31) -1 )) {
            return 0;
        }
        
        return ans;
    } 
}
