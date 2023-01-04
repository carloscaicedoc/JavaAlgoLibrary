public class TestKata {
    public static void main(String[] args) {
        Kata kata = new Kata();

        int[] arr = kata.digitize(35231);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}