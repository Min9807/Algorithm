import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }
        
        return set.size() < nums.length/2 ? set.size() : nums.length/2;
    }
}