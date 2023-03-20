import java.util.*;
class Solution {
    public String solution(String s) {
        String[] ars = s.split("");
        
        String answer = "";
        String str = "";
        for(int i=0;i<ars.length;i++){
            int count = 0;
            for(String a : ars){
                if(ars[i].equals(a)){
                    count++;
                }
            }
            if(count==1){
                str+=ars[i];
            }
        }
        String[] result = str.split("");
        Arrays.sort(result);
        for(String a : result){
            answer+=a;
        }
        return answer;
    }
}