public class Test {
    public static void main(String[] args) {
        Kata kata = new Kata();

        System.out.println(kata.numberToString(123));
        System.out.println(kata.numberToString(-999));
        System.out.println(kata.numberToStringValueOf(123));
        System.out.println(kata.numberToStringValueOf(-999));
    }
}
