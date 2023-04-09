import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        
        List<Integer> stack = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            if(stack.size()==k){
                if(stack.get(0)<score[i]){
                    stack.add(score[i]);
                    stack.remove(0);
                    Collections.sort(stack);
                }
            }
            else{
                stack.add(score[i]);
                Collections.sort(stack);
            }
            
            
            answer[i] = stack.get(0);
        }
        
        return answer;
    }
}