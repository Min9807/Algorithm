import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int[] answer = new int[200];
        int num = 0;
        
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++){
                answer[j] +=1;
            }
        }
        
        for(int a:answer){
            if(a>1){
                num++;
            }
        }
        

        return num;
    }
}