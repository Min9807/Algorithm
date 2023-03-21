import java.util.*;
class Solution {
    public String solution(String s) {
        String[] ars = s.split(" ");
        int[] number = new int[ars.length];
        for(int i=0; i<ars.length; i++){
            number[i] = Integer.valueOf(ars[i]);
        }
        
        Arrays.sort(number);
        String max = String.valueOf(number[number.length-1]);
        String min = String.valueOf(number[0]);
        
        String answer = min + " " + max;
        
        return answer;
    }
}