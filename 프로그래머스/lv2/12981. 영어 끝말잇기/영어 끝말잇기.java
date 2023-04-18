import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        List<String> already = new ArrayList<>(); // 사용한 단어 저장공간
        already.add(words[0]);
        int count = 1; // 끝말잇기 진행 
        
        for(int i=0; i<words.length/n; i++){ // n번째 턴을 반복
            for(int j=0; j<n; j++){ // 사람인원수에 따라 반복
                if(i==0 && j==0){
                    continue;
                }
                char nowWord = words[count].charAt(0); // 현재 단어의 첫번째 알파벳
                char preWord = words[count-1].charAt(words[count-1].length()-1); // 이전 단어의 마지막 알파벳
                
                if(already.contains(words[count]) || nowWord != preWord){ // 사용한 단어를 쓰거나 끝말잇기 규칙에 어긋난 경우
                    return new int[]{j+1, i+1};
                }       
                
                already.add(words[count]);
                count++;
            }
        }


        return answer;
    }
    
    
}