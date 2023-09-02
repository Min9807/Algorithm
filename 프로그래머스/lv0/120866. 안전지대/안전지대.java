class Solution {
    int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    int[] dy = {1, -1, 0, 0, -1, 1, -1, 1};
    public int solution(int[][] board) {
        int answer = 0;
        int y = board.length;
        int x = board[0].length;
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                if(board[i][j] == 1){
                    calcu(j, i, x, y, board);
                }
            }
        }
        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    private void calcu(int x, int y, int maxX, int maxY, int[][] board){
        for(int i=0; i<8; i++){
            int kx = x + dx[i];
            int ky = y + dy[i];
            if(kx >= 0 && kx < maxX && ky >= 0 && ky < maxY){
                if(board[ky][kx] != 1){
                    board[ky][kx] = 2;
                }
            }
        }
    }
}