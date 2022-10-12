
public class Test {
    public static void main(String[] args) {

        Solution test = new Solution();
        int[] testArray = {0,1,0,3,12,7,8};
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
        System.out.println(test.moveZeroes(testArray));
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }

    }
}
