import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        Arrays.sort(arr);
        for(int a : arr){
            if(a%divisor==0){
                count++;
            }
        }
        if(count==0){
            return new int[]{-1};
        }
        int[] answer = new int[count];
        int k = 0;
        for(int a: arr){
            if(a%divisor==0){
                answer[k] = a;
                k++;
            }
        }
        return answer;
    }
}