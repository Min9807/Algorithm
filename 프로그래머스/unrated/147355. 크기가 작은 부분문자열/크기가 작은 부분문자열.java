import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        String[] ars1 = t.split("");
        
        for(int i=0; i<(t.length()-len+1); i++){
            String str = "";
            for(int j=i; j<len+i; j++){
                str += ars1[j];
            }
            if(Long.parseLong(str) <= Long.parseLong(p)){
                answer++;
            }
        }

        
        return answer;
    }
}