import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(String operation : operations){
            String[] str = operation.split(" ");
            
            // 큐에 숫자 삽입.
            if(str[0].equals("I")){
                q.offer(Integer.parseInt(str[1]));
                
            // 최댓값을 삭제
            }else if(str[1].equals("1")){
                if(q.size() > 1){
                    int[] ary = new int[q.size()-1];
                    for(int i=0; i<ary.length; i++){
                        ary[i] = q.poll();
                    }
                    q.poll();
                    for(int i=0; i<ary.length; i++){
                        q.offer(ary[i]);
                    }
                }else{
                    q.poll();
                }
            }
            
            // 최솟값을 삭제
            else{
                q.poll();
            }
        }
        
        if(q.size() == 0){
            return answer;
        }
        if(q.size() == 1){
            answer[0] = q.poll();
            return answer;
        }
        answer[1] = q.poll();
        
        while(q.size() != 0){
            
            if(q.size() == 1){
                answer[0] = q.poll();
            }
            q.poll();
        }
        
        return answer;
    }
}