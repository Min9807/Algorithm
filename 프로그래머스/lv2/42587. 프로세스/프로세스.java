import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        char answer = 'a';
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        char[] chars = new char[priorities.length];
        
        for(int i=0; i<priorities.length; i++){
            char a = (char)(65+i);
            q.offer(a);

            if(i == location){
                answer = a;
            }
            map.put(a, priorities[i]);    
        }
        int idx = 0;
        while(!q.isEmpty()){
            char k = q.poll();

            boolean check = true;
            for(char c : q){
                if(map.get(k) < map.get(c)){
                    q.offer(k);
                    check = false;
                    break;
                }
            }
            if(check){
                chars[idx] = k;
                idx++;
            }
        }
        int result = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] == answer){
                result = i+1;
            }
        }
        
        
        return result;
    }
}