import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int k = 0;
        
        Arrays.sort(people);
        
        for(int i=people.length-1; i>=k; i--){
            if(people[i] + people[k] <=limit){
                answer++;
                k++;
            }
            else{
                answer++;
            }
        }
        
        return answer;
    }
}