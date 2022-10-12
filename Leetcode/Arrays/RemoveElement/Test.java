
public class Test {
    public static void main(String[] args) {

        Solution test = new Solution();
        int[] testArray = {3,2,2,3};

        System.out.println(test.removeElement(testArray, 3));
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }        
    }
}
