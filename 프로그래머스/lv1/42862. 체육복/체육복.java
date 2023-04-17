import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){ // 체육복이 있는데, 도난당한사람
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        for(int a : lost){
            for(int i=0; i<reserve.length; i++){
                if(reserve[i] == a-1 || reserve[i] == a+1){
                    reserve[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
