import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] xx = new int[10];
        int[] yy = new int[10];
        for(String a : X.split("")){
            xx[Integer.parseInt(a)]++;
        }
        for(String a : Y.split("")){
            yy[Integer.parseInt(a)]++;
        }
        
        for(int i=9; i>=0; i--){
            answer += String.valueOf(i).repeat(Math.min(xx[i], yy[i]));
        }
        if(answer.isEmpty()){
            return "-1";
        }
        else if(answer.replaceAll("0","").isEmpty()){
            return "0";
        }
        
        return answer;
    }
}