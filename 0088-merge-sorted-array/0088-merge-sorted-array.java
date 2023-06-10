import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = 0;
        int[] answer = new int[m+n];

        for(int i=0; i<n; i++){
            answer[idx++] = nums2[i];
        }
        for(int i=0; i<m; i++){
            answer[idx++] = nums1[i];
        }
        for(int i=0; i<m+n; i++){
            nums1[i] = answer[i];
        }
        Arrays.sort(nums1);

    }
}