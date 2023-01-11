public class Test {
    public static void main(String[] args) {
        Kata kata = new Kata();

        int[] arr = {2, 4, 6, 8};
        System.out.println(kata.grow(arr));
        System.out.println(kata.growEnhanced(arr));
        System.out.println(kata.growIntStream(arr));
        System.out.println(kata.growArrays(arr));
        System.out.println(kata.growWhileLoop(arr));
    }
}