// leetCode 412

import java.util.ArrayList;

class Solution {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results.add("FizzBuzz");
            } else if (i % 3 == 0){
                results.add("Fizz");
            } else if (i % 5 == 0){
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}