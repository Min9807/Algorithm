import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] chars = skill.toCharArray();
        for(String skill_tree : skill_trees){
            if(check(chars, skill_tree)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean check(char[] chars, String skill_tree){
        int idx = 0;
        for(char skill : skill_tree.toCharArray()){
            if(idx == chars.length-1) return true;
            if(skill == chars[idx]){
                idx++;
                continue;
            }
            for(int i=idx+1; i<chars.length; i++){
                if(skill == chars[i]) return false;
            }
        }
        return true;
    }
}