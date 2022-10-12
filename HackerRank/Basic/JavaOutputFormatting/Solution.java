import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for (int k=0; k<3; k++) {
            String word = input.nextLine();
            String str = word.substring(0, word.indexOf(" "));
            String num = word.substring(word.indexOf(" ")).trim();
            for (int i=str.length(); i < 15; i++) {
                str += " ";
            }
            if (num.length() == 1) {
                str += "00" + num + "\n";
            } else if (num.length() == 2) {
                str += "0" + num + "\n";
            } else {
                str += num + "\n";
            }
            System.out.printf(str);
        }
        System.out.println("================================");
    }
}