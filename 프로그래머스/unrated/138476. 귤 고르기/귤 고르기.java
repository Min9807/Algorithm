import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int a : tangerine){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int count =0;
        while(k>0){
            k -= list.get(count);
            answer++;
            count++;
        }
        
        return answer;
    }
}