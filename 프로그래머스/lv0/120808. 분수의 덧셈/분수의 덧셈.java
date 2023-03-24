import java.util.*;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int resultDenom = denom1 * denom2;
        int resultNumer = numer1 * (resultDenom/denom1) + numer2 * (resultDenom/denom2);
        
        for(int i=resultDenom; i>1; i--){
            if(resultDenom %i == 0 && resultNumer % i ==0){
                resultDenom /= i;
                resultNumer /= i;
            }
        }
        
        answer[0] = resultNumer;
        answer[1] = resultDenom;
        
        return answer;
    }
}