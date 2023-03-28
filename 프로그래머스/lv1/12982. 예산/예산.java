import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = budget;
        Arrays.sort(d);



        for(int i=0; i<d.length; i++){
            budget-=d[i];
            answer++;
            if(budget<0){
                answer--;
                break;
            }
        }

        return answer;
    }
}