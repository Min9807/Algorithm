import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        Iterator<Integer> iterator = set.iterator();
        int idx = 0;
        int[] remain = new int[set.size()];
        while(iterator.hasNext()){
            remain[idx++] = iterator.next();
        }
        Arrays.sort(remain);
        for(int i=0; i<set.size(); i++){
            nums[i] = remain[i];
        }

        return set.size();
    }
}