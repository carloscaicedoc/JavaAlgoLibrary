/*
LeetCode 125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into 
lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. 
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise. 
*/

public class Solution { 
    public boolean isPalindrome(String str) {    
        for (int i = 0; i < Math.floor(str.length()/ 2); i++) {
            char leftChar = Character.toLowerCase(str.charAt(i));
            char rightChar = Character.toLowerCase(str.charAt(str.length() - 1 - i));
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeReverse(String str) {
        StringBuilder builder = new StringBuilder();

        char[] strArray = str.toCharArray();

        for (char ch : strArray) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reverseString = builder.reverse().toString();

        return filteredString.equals(reverseString);
    }

    public boolean isPalindromeTwoPointers(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            } 
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } 

            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}