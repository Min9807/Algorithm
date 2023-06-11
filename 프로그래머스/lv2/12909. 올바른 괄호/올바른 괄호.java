import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push('(');
            }else if(c == ')' && st.size() == 0){
                return false;
            }else{
                st.pop();
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }
        
        return answer;
    }
}