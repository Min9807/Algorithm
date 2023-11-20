import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) {
            return 5 * cities.length;
        }
        List<String> list = new ArrayList<>();
        for(int i=0; i<cities.length; i++) {
            String location = cities[i].toUpperCase();
            if(list.contains(location)) { // 캐시 히트
                answer++;
                list.remove(location);
                list.add(location);
            }
            else if(list.size() == cacheSize) { // 캐시 미스
                answer += 5;
                list.remove(0);
                list.add(location);
            } else {
                list.add(location);
                answer += 5;
            }
        }
        return answer;
    }
}