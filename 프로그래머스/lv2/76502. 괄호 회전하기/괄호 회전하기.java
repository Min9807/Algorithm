import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            String str = s.substring(i) + s.substring(0,i);
            if(check(str)){
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean check(String str){
        Stack<Character> st = new Stack<>();
        
        for(char c : str.toCharArray()){
            if(c == '[' || c == '{' || c == '(') st.push(c);
            else if(st.isEmpty() && (c == ']' || c == ')' || c == '}')) return false;
            else if(st.peek() == '(' && c == ')') st.pop();
            else if(st.peek() == '[' && c == ']') st.pop();
            else if(st.peek() == '{' && c == '}') st.pop();
            
        }
        
        if(!st.isEmpty()) return false;
        
        return true;
    }
}