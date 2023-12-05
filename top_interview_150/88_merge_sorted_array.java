class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[m+n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        for (i = 0; i < n + m; i++) {
            nums1[i] = temp[i];
        }
    }
}

// this solution considers going from the smallest numbers towards the largest
// which makes the temporary array necessary, in order to avoid a third option
// besides the two considered in the two pointer solution

// an alternative to this is to also use a two pointer solution, but working
// downwards
