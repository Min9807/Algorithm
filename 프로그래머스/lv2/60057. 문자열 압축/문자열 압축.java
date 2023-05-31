import java.util.*;
class Solution {
    
    // n개 단위로 잘라 압축하는 작업.
    private int compression(String s, int i){
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        // n개 단위로 list로 넣는 작업.
        for(char c : s.toCharArray()){
            sb.append(c);
            if(sb.length() == i){
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        // 마지막에 남은 수 넣어주는.
        list.add(sb.toString());
        sb.setLength(0);
        int count = 1;
        for(int j=0; j<list.size()-1; j++){

            // 현재 인덱스와 현재+1 인덱스의 값이 같을 경우.
            if(list.get(j).equals(list.get(j+1))){
                count++;
            } 
            
            else if(count != 1){
                sb.append(count + list.get(j));
                count = 1;
            } 
            
            else{
                sb.append(list.get(j));
            }
            
        }
        if(count!=1){
            sb.append(count + list.get(list.size()-1));
        } else{
            sb.append(list.get(list.size()-1));
        }
        return sb.length();
    }
    
    public int solution(String s) {
        int answer = s.length();

        for(int i=1; i<=s.length()/2; i++){
            int tar = compression(s, i);
            if(answer > tar){
                answer = tar;
            }
        }
        
        return answer;
    }
}