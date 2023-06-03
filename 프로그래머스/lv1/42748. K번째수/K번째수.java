import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int len = commands[i][1]-commands[i][0]+1;
            int[] ary = new int[len];
            
            for(int j=0; j<len; j++){
                ary[j] = array[commands[i][0]+j-1];
            }
            
            Arrays.sort(ary);
            answer[i] = ary[commands[i][2]-1];
        }
        return answer;
    }
}