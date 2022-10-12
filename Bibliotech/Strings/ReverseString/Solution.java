/* 
REVERSE STRING     
Given a String, return a new string that is the given string reversed.
 */

public class Solution {
    public String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        // alternative loop: 
        // for (int i = 0; i < str.length(); i++) {
        //     reversed = str.charAt(i) + reversed;
        // }

        return reversed;
    }
}