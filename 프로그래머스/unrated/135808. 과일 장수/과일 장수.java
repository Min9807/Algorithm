import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        
        int count = score.length-m;
        for(int i=0; i<score.length/m; i++){
            answer= answer + (score[count] * m);
            count -= m;
        }
        
        return answer;
    }
}