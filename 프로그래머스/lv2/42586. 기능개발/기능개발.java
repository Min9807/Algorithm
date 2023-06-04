import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int a : progresses){
            q.offer(a);
        }
        
        int count = 0;
        int work = 0;
        while(!q.isEmpty()){
            count++;
            while(q.peek() + (speeds[speeds.length - q.size()] * count) >= 100){
                work++;
                q.poll();
                if(q.isEmpty()) break;
            }
            if(work != 0){
                list.add(work);
                work = 0;
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}