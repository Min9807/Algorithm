import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = arr[arr.length-1];
        
        int num1 = arr[0];

        for(int i=1; i<arr.length; i++){
            int num2 = arr[i];
            int result = Math.max(num1, num2);

            while(true){
                if(result % num1 == 0 && result % num2 == 0){
                    break;
                }
                result += Math.max(num1, num2);
            }

            num1 = result;
            answer = result;
        }
        
        for(int i=1; i<arr.length; i++){
            
        }
        
        
        return answer;
    }
}