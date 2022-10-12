
public class Test {
    public static void main(String[] args) {

        Solution test = new Solution();
        int[] numsA = {4, 9, 12, 17, 25, 30, 37}; 
        int[] output = test.twoSum(numsA, 55);
        
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
}
