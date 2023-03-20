import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] copyary = Arrays.copyOf(array, array.length);
        Arrays.sort(array); 
        answer[0] = array[array.length-1];
        for(int i=0; i<copyary.length; i++){
            if(copyary[i] == answer[0]){
                answer[1] = i;
            }
        }
        return answer;
    }
}
