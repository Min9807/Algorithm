import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int a : scoville){
            q.offer(a);
        }
        while(q.peek() < K){
            answer++;
            int a = q.poll();
            int b = q.poll();
            q.offer(a + (b*2));

            if(q.size() == 1 && q.peek() < K) return -1;
        }
        
        return answer;
    }
}