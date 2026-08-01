import java.util.Arrays;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] max = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int idx = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    idx = j;
                    break; 
                }
            }

           
            int greaterElement = -1;
            for (int k = idx + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    greaterElement = nums2[k];
                    break; 
                }
            }
            max[i] = greaterElement;
        }
        
        return max;
    }
}