public class TestKata {
    public static void main(String[] args) {
        Kata test = new Kata();

        String[] output = test.stringToArraySplit("winter is coming");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}