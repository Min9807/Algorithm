import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(reserve[i]==lost[j]){
                    lost[j] = -1;
                    reserve[i] = -1;
                    answer++;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]-1 || lost[i] == reserve[j] + 1){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }

        }
        
        return answer;
    }
}