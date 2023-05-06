import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int count = 1;
        int len = elements.length;
        
        while(count != len+1){
            for(int i=0; i<len; i++){
                int sum = 0;
                for(int j=i; j<i+count; j++){
                    sum += elements[j%len];
                }
                set.add(sum);
            }
            count++;
        }
        
        return set.size();
    }
}