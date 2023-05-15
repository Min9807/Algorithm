class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCount = 0;
        int answerCount = 0;
        
        for(int lotto : lottos){
            if(lotto == 0){
                zeroCount++;
                continue;
            }
            // 정답이 몇개인지 세는
            for(int win_num : win_nums){
                if(lotto == win_num){
                    answerCount++;
                    break;
                }
            }
        }
        
        for(int i=0; i<2; i++){
            if(i==0) answer[i] = zeroCount + answerCount; 
            else answer[i] = answerCount;
            
            switch(answer[i]){
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }
        }
        
        return answer;
    }
}