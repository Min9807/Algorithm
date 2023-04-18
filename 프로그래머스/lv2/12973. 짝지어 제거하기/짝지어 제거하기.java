import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ch == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? 1 : 0; 
    }
}