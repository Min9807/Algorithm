import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            q.offer(work);
        }
        while(n-- > 0){
            int num = q.poll();
            if(num > 0){
                q.offer(num-1);
            }else{
                break;
            }
        }
        
        while(!q.isEmpty()){
            int num = q.poll();
            answer += num * num;
        }

        return answer;
    }
}