import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(') st.push('(');
            else if(st.isEmpty() && c == ')') return false;
            else if(st.peek() == '(' && c == ')') st.pop();
        }
        if(!st.isEmpty()){
            return false;
        }

        return answer;
    }
}