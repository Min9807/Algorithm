import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Arrays.fill(answer, -1);
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i=1; i<len; i++) {
            while(!st.isEmpty() && numbers[st.peek()] < numbers[i]) {
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
        }


        return answer;
    }
}