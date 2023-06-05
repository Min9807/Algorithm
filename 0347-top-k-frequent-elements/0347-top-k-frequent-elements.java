import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(int num : map.keySet()){
            q.offer(num);
            if(q.size() > k){
                q.poll();
            }
        }

        int[] answer = new int[k];
        for(int i=k-1; i>=0; i--){
            answer[i] = q.poll();
        }
        

        return answer;
    }
}