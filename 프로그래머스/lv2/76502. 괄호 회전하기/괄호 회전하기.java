import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            String a = s.substring(i,s.length()) + s.substring(0,i);
            
            if(check(a)){
                answer++;
            }
        }
        return answer;
    }
    public boolean check(String str){
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                st.push(str.charAt(i));
            }                
                
            else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']'){
                if(st.empty()){
                    return false;
                }
                switch(st.peek()){
                    case '{':
                        if('}' == str.charAt(i)) break;
                        else{
                            return false;
                        }
                    case '[':
                        if(']' == str.charAt(i)) break;
                        else{
                            return false;
                        }
                    case '(':
                        if(')' == str.charAt(i)) break;
                        else{
                            return false;
                        }
                }

                st.pop();
            }
            
            else{
                return false;
            }
        }
        
        
        if(!st.empty()){
            return false;
        }
        
        return true; 
    }
}