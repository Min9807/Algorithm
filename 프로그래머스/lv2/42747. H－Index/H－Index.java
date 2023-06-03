import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<=citations[citations.length-1]; i++){
            int count = 0;
            for(int b : citations){
                if(i <= b) count++;
            }
            if(count >= i){
                answer = i;
            }
        }
        return answer;
    }
}