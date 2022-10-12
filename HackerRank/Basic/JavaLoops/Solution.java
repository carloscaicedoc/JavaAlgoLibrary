import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Bufferedreader bufferedreader = new Bufferedreader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedreader.readLine().trim());
        // For Loop:
        for (int i=1; i<=10; i++) {
            int result = N * i;
            System.out.printf("%s x %s = %s\n", N, i, result);
            // Alternative output fomat:
            // System.out.println(N + " x " + i + " = " + result + "\n");
        }
        bufferedreader.close();
    }
}