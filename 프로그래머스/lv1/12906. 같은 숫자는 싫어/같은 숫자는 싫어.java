import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int num = 10;
        for(int a : arr){
            if(num != a){
                list.add(a);
            }
            num = a;
        }
        int[] answer = new int[list.size()];
        int count =0;
        for(int a : list){
            answer[count] = a;
            count++;
        }

        return answer;
    }
}