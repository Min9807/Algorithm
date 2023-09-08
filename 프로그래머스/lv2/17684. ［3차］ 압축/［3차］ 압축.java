import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        int idx = 27;
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char)('A' + i)), i + 1);
        }
        
        for(char c : msg.toCharArray()){
            sb.append(c);
            if(!map.containsKey(sb.toString())) {
                String found = sb.substring(0, sb.length() - 1);
                list.add(map.get(found));
                
                map.put(sb.toString(), idx++);
                sb.setLength(0);
                sb.append(c);
            }
        }
        
        if(sb.length() > 0) {
            list.add(map.get(sb.toString()));
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}