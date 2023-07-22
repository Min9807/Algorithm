import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Stack<State> st = new Stack<>();
        
        st.push(new State(0, 0));
        
        while(!st.isEmpty()){
            State state = st.pop();
            
            if(state.index == numbers.length){
                if(state.acc == target){
                    answer++;
                }
                continue;
            }
            st.push(new State(state.index + 1, state.acc - numbers[state.index]));
            st.push(new State(state.index + 1, state.acc + numbers[state.index]));
        }
        
        return answer;
    }
    
    private static class State{
        public final int index;
        public final int acc;
        
        public State(int index, int acc){
            this.index = index;
            this.acc = acc;
        }
    }
}