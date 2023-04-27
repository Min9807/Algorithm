import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){ // 각 기능마다 일수 계산.
            int n = 0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                n++;
            }
            queue.add(n);
        }
        
        int count = 0;
        int temp = 0;
        while(!queue.isEmpty()){
            if(temp <= queue.peek()){
                temp = queue.poll();
            } else{
                queue.remove();
            }
            
            count++;
            if(queue.isEmpty()){
                list.add(count);
                break;
            }
            else if(queue.peek() > temp){
                list.add(count);
                count = 0;
                temp = 0;
            }
        }
        
        int[] answer = new int[list.size()]; // 리스트를 배열로 변환하기 위한
        for(int i=0; i<list.size(); i++){ // 배열로 변환하는 작업
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}