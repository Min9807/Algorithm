import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] result = new int[3];
        for(int i=0; i<answers.length; i++){
            if(one[i%(one.length)] == answers[i]) result[0]++;
            if(two[i%(two.length)] == answers[i]) result[1]++;
            if(three[i%(three.length)] == answers[i]) result[2]++;
        }
        
        int max = -1;
        for(int a : result){
            if(a > max){
                max = a;
            }
        }
        
        int count = 0;
        
        for(int a : result){
            if(a == max){
                count++;
            }
        }
        int[] answer = new int[count];
        count = 0;
        for(int i=0; i<result.length; i++){
            if(max == result[i]){
                answer[count] = i+1;
                count++;
            }
        }
        
        return answer;
    }
}