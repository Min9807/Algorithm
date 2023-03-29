import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            answer[i] = sp(commands[i][0], commands[i][1], commands[i][2], array);
        }
        return answer;
    }
    static int sp(int i, int j, int k, int[] arr){
        int[] arr1 = Arrays.copyOfRange(arr, i-1, j);
        Arrays.sort(arr1);
        return arr1[k-1];
    }
}