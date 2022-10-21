/* CodeWars 8kyu. Convert a String to an Array

Write a function to split a string and convert it into an array of words.
Examples:
"Robin Singh" ==> ["Robin", "Singh"]
"I love arrays" ==> ["I", "love", "arrays"]
*/

import java.util.ArrayList;

class Kata {
    // .Split(" ") approach
    public static String[] stringToArraySplit(String s) {
        return s.split(" ");
    }

    public static String[] stringToArray(String s) {
        String temp = "";
        ArrayList<String> res = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter == " " || i == s.length() - 1) {
                if (i == s.length() - 1) {
                    temp += letter;
                }
                res.add(temp);
                temp = "";
            } else {
                temp += letter;
            } 
        }

        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
            System.out.println(result[i]);
        }

        return result;
    }

    public static String[] stringToArray2(String s) {
        ArrayList<String> res = new ArrayList<String>();
        String currWord = "";

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == ' ') {
                if (currWord.length() > 0) {
                    res.add(currWord);
                    currWord = "";
                }
            } else {
                currWord += Character.toString(character);
            } 
        }
        // Add the last word to the array if the last element is not an empty space. 
        if (currWord.length() > 0) {
            res.add(currWord);
        }
        // ArrayList to String[]
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}