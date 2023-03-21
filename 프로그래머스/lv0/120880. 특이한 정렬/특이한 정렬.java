import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        List<Integer> list = new ArrayList<>();
        for(int a : numlist){
            list.add(a);
        }
        
        for(int i=0; i<numlist.length; i++){
            
            int min = Integer.MAX_VALUE;
            
            for(int a : list){
                int cur_abs = Math.abs(n-a);
                int min_abs = Math.abs(n-min);
                
                if(cur_abs==min_abs){
                    min = Math.max(a, min);
                    
                }else if(cur_abs<min_abs){
                    min = a;
                }
            }
            answer[i] = min;
            list.remove(Integer.valueOf(min));
        }

        
        return answer;
    }
}