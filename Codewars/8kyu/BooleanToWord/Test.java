public class Test {
    public static void main(String[] args) {
        Kata test = new Kata();
        boolean isSunny = true;
        System.out.println(test.boolToWord(isSunny));
        System.out.println(test.boolToWordTernaryOperator(isSunny));
    }
}