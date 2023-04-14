import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stacks = new Stack<>();   
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stacks.push('(');
            }
            
            else if(s.charAt(i)==')'){
                if(stacks.empty()){
                    return false;
                }
                stacks.pop();
            }
        }
        
        if(!stacks.empty()){
            return false;
        }
        return true;
    }
}