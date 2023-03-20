import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ars = my_string.toLowerCase().split("");
        Arrays.sort(ars);
        for(String a : ars){
            answer+=a;
        }
        return answer;
    }
}