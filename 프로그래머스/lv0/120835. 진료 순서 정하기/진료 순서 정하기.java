import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] args = emergency.clone();
        Arrays.sort(emergency);

        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(args[i] == emergency[j]){
                    answer[i] = emergency.length-j;
                }
            }
        }
        
        return answer;
    }
}