/* CodeWars 7kyu - Printer Errors

You have to write a function printer_error which given a string 
will return the error rate of the printer as a string representing a rational 
whose numerator is the number of errors and the denominator the length of the control string. 
Don't reduce this fraction to a simpler expression.
The string has a length greater or equal to one and contains only letters from ato z.

Examples:
s="aaabbbbhaijjjm" -- printer_error(s) => "0/14"
s="aaaxbbbbyyhwawiwjjjwwm" -- printer_error(s) => "8/22"
*/

public class Printer {
    public static String printerError(String s) {
        int l = s.length();
        int counter = 0;
        String colors = "abcdefghijklm";

        for (int i=0; i<s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            // String letter = String.valueOf(s.charAt(i));
            if (!colors.contains(letter)) {
                counter++;
            }
        }
        
        String errors = Integer.toString(counter);
        String lng = Integer.toString(l);
        // String result = errors + "/" + lng;
        String result = String.format("%s/%s", errors, lng);
        
        return result;
    }
    
    // Alternative Solutions:

    // .replaceAll()
    public static String printerErrorReplace(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
    
    // .filter(ch -> ch > 'm')
    public static String printerErrorFilter(String s) {
        long errs = s.chars().filter(ch -> ch > 'm').count();
        return errs + "/" + s.length();
    }
    
    // .toCharArray()
    public static String printerErrorCharArray(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c > 'm' || c < 'a') {
                c++;
            }
        }
        return count + "/" + s.length();
    }
    
    public static String printerErrorCharAt(String s) {
        int cnt = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) > 'm') {
                cnt++;
            }
        }
        return Integer.toString(cnt) + "/" + Integer.toString(s.length());
    }

    public static String printerError7(String s) {
        int count = 0;
        String res = "";
        // break down the string to an array of chars
        char [] colorArr = s.toCharArray();
        //check how many wrong chars are in the string
        for (char elem : colorArr){
          if (elem > 'm' || elem < 'a'){
            count ++;
          }
      }
      res += Integer.toString(count) + "/" + Integer.toString(s.length());
      return res;
    }

    public static String printerError8(String s) {
        int numErrors = 0;
        
        for (int i = 0; i < s.length(); i++) {
          if(s.charAt(i) > 109){
            numErrors++;
          }
        }
        
        return numErrors + "/" + s.length();
    }
}
