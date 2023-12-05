// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150

// using a temporary array
class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i+k) % temp.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

    }
}

//class Solution {
//    public void rotate(int[] nums, int k) {
//        int[] temp = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            temp[(i+k) % temp.length] = nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = temp[i];
//        }
//
//    }
//}
