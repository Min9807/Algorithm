import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];
        
        for(int i=0; i<len; i++){
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(strings);
        
        for(int i=0; i<len; i++){
            answer[i] = strings[i].substring(1);
        }

        
        
        return answer;
    }
}