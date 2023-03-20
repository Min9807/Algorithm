class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String direction : keyinput){
            if(direction.equals("up")){
                if(answer[1] < (board[1]-1)/2){
                    answer[1] += 1;
                }
            }
            else if(direction.equals("down")){
                if(answer[1] > -(board[1]-1)/2){
                    answer[1] += -1;
                }
            }
            else if(direction.equals("right")){
                if(answer[0] < (board[0]-1)/2){
                    answer[0] += 1;
                }
                
            }
            else if(direction.equals("left")){
                if(answer[0] > -(board[0]-1)/2){
                    answer[0] += -1;
                }
                
            }
        }
        return answer;
    }
}