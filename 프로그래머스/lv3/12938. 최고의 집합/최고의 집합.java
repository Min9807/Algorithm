import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if(n > s){
            return new int[]{-1};
        }
        int[] answer = new int[n];
        
        int min = s/n;
        int maxIdx = s%n;
        
        for(int i=0; i<n; i++){
            answer[i] = min;
        }
        for(int i=0; i<maxIdx; i++){
            answer[n-i-1] += 1;
        }
        
        return answer;
    }
}