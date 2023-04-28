import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        List<String> store = new ArrayList<>();
        
        for(String city : cities){
            if(store.contains(city.toLowerCase())){
                store.remove(city.toLowerCase());
                store.add(0, city.toLowerCase());
                answer += 1;
            }
            else if(store.size() < cacheSize){
                store.add(0, city.toLowerCase());
                answer += 5;
            }
            else{
                store.remove(cacheSize-1);
                store.add(0, city.toLowerCase());
                answer += 5;
            }
        }
        
        
        return answer;
    }
}