class Solution {

    public Integer stringIntro(String str1, String str2) {

        Integer lengthSum = str1.length() + str2.length();
        System.out.println(lengthSum);
        char a = str1.charAt(0);
        char b = str2.charAt(0);
        System.out.println(a > b ? "Yes" : "No");
        String word1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String word2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        String outputStr = word1 + " " + word2;
        System.out.println(outputStr);

        return lengthSum;
    }  
}

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A = sc.next();
//         String B = sc.next();
//         /* Enter your code here. Print output to STDOUT. */
//         int L = A.length() + B.length(); 
//         System.out.println(L);
//         char a = A.charAt(0);
//         char b = B.charAt(0);
//         System.out.println(a > b ? "Yes" : "No");
//         String word1 = A.substring(0, 1).toUpperCase() + A.substring(1);
//         String word2 = B.substring(0, 1).toUpperCase() + B.substring(1);
//         System.out.println(word1 + " " + word2);
//     }
// }
