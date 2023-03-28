class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0; i<sizes.length; i++){ // 가로세로 구분없이 큰값을 첫번째 원소로 이동
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int max_X = 0; // max 가로길이
        int max_Y = 0; // max 세로길이
        
        for(int i=0; i<sizes.length; i++){ // max값 찾기
            if(sizes[i][0] > max_X){
                max_X = sizes[i][0];
            }
            if(sizes[i][1] > max_Y){
                max_Y = sizes[i][1];
            }
        }
        
        answer = max_X * max_Y;
        return answer;
    }
}