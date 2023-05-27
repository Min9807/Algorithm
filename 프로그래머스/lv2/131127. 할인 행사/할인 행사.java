import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;
        while(idx<=discount.length-10){
            for(int i=0; i<want.length; i++){
                map.put(want[i], map.getOrDefault(want[i], 0) + number[i]);
            }
            
            // discount
            for(int i=idx; i<10+idx; i++){
                if(map.containsKey(discount[i])){
                    map.put(discount[i], map.get(discount[i]) - 1);
                }
            }
            
            // 개수가 0개 이하면 map에서 삭제

            for(String key : want){
                if(map.get(key) <= 0){
                    map.remove(key);
                }
            }
            if(map.size() == 0){
                answer++;
            }
            map.clear();
            idx++;
        }
        return answer;
    }
}