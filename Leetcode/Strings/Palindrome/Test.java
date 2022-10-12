
public class Test {
    public static void main(String[] args) {

        Solution palindromeChecker = new Solution();
        boolean outputTest = palindromeChecker.isPalindrome("KAYAK");
        System.out.println(outputTest);
        boolean outputTest2 = palindromeChecker.isPalindromeReverse("Mom");
        System.out.println(outputTest2);
        boolean outputTest3 = palindromeChecker.isPalindromeTwoPointers("A man, a plan, a canal: Panama!");
        System.out.println(outputTest3);

    }
}

