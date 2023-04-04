import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] count = {0, 0, 0};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5]) count[0]++;
            if(answers[i] == two[i%8]) count[1]++;
            if(answers[i] == three[i%10]) count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        List<Integer> num = new ArrayList<>();
        
        for(int i=0; i<3; i++){
            if(count[i] == max){
                num.add(i+1);
            }
        }
        
        int[] answer = new int[num.size()];
        
        for(int i=0; i<num.size(); i++){
            answer[i] = num.get(i);
        }
        
        
        return answer;
    }

}