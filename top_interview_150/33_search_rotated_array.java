// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int m;

        while (s <= e) {
            m = (s + e)/2;

            if (nums[m] == target) {
                return m;
            }

            if (nums[s] <= nums[m]) { // left half is sorted
                if (nums[s] <= target && target < nums[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {  // right half is sorted
                if (nums[m] < target && target <= nums[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }

        return -1;
    }
}
