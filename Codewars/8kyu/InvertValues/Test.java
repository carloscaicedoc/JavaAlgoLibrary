public class Test {
    public static void main(String[] args) {
        Kata test = new Kata();
        
        int[] array1 = {1,-2,3,-4,5};
        int[] output = test.invert(array1);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
