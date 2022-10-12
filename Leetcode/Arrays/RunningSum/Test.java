
public class Test {
    public static void main(String[] args) {
        Solution algoTest = new Solution();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] finalArray1 = algoTest.runningSum(testArray);
        for (int i = 0; i < finalArray1.length; i++) {
            System.out.println(finalArray1[i]);
        }
    }
}
