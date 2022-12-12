/* LeetCode 704. Binary Search

Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search target in nums. 
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
*/

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if target is at mid index.
            if (nums[mid] == target) {
                return mid;
            } 
            // If target greater, ignore left half
            if (nums[mid] < target) {
                left = mid + 1; 
            }
            else {
            // If target smaller, ignore right half
                right = mid - 1;
            }
        }

        return -1;
    }

    int binarySearch(int[] sortedNums, int searchNum) {
        int leftIdx = 0;
        int rightIdx = sortedNums.length - 1;

        while (leftIdx <= rightIdx) {
            int midIdx = (int)Math.floor(rightIdx - leftIdx / 2);      
            if (sortedNums[midIdx] == searchNum) {
                return midIdx;
            }
            if (sortedNums[midIdx] < searchNum) {
                leftIdx = midIdx + 1;
            } else {
                rightIdx = midIdx - 1;
            }
        }

        return -1;
    }
}
