import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] normal = new int[score.length]; // 1차원 배열로 만듬
        
        for(int i=0; i<score.length; i++){
            normal[i] = score[i][0] + score[i][1];
        }
        
        int[] rank = normal.clone(); // 순위 매길라고
        
        Arrays.sort(rank);
        
        int[] reverseArr = new int[rank.length]; // 1등으로 바꾼것.
        
        for (int i = rank.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = rank[i];
        }
        for(int i=0;i<rank.length; i++){
            for(int j=0; j<rank.length; j++){
                if(normal[i]==reverseArr[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}