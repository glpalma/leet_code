// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        int available_slot = 1;
        int last_saved = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != last_saved) {
                nums[available_slot] = nums[i];
                available_slot++;
                last_saved = nums[i];
            }
        }

        return available_slot;
    }
}

