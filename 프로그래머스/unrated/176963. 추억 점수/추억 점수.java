import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len1 = photo.length;
        int[] answer = new int[len1];

        for(int i=0; i<len1; i++){
            int score = 0; // 점수 저장하는
            
            for(String a : photo[i]){ // 원소들 찾아 점수 계산
                int b = Arrays.asList(name).indexOf(a);
                if(b==-1) continue;
                score += yearning[b];
            }
            answer[i] = score;
        }
        
        
        return answer;
    }
}