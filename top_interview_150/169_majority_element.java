// 169. Majority Element
// https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

// Moore's voting algorithm
// possible solutions were to use a hash map to count the number of
// occurrences of each number or to sort the array and return
// the middle element (given that the majority element appears at least
// n/2 times