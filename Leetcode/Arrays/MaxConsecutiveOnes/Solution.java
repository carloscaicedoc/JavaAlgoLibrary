class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Initialize and declare variable to keep track
        // of how many 1's you've seen in a row
        int count = 0;
        int maxCount = 0;
        // Edge case
        if (nums.length == 1 && nums[0] == 1) {
            return 1;
        }

        // For Loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
                maxCount = Math.max(maxCount, count);
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return maxCount;
    }
}

// if (nums[i] == 1 && nums[i - 1] != 1 || i == 0 && nums[i] == 1) {
// count += 1;
// maxCount = Math.max(maxCount, count);
// } else if (nums[i] == 1 && nums[i] == nums[i - 1]) {
// count += 1;
// maxCount = Math.max(maxCount, count);
// } else {
// count = 0;
// }