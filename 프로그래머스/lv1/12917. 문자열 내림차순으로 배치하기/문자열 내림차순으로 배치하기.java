import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ars = s.split("");
        Arrays.sort(ars, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ars.length; i++){
            if((int)ars[i].charAt(0) >= 65 && (int)ars[i].charAt(0) <= 90){
                sb.append(ars[i]);
                ars[i] = "";
            }
        }
        for(String a : ars){
            answer+=a;
        }
        answer += sb.toString();
        return answer;
    }
}