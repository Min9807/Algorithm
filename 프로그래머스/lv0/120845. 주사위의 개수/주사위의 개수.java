class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i=0; i<3; i++){
            if(i==2){
                answer *= box[i]/n;
                break;
            }
            answer *= box[i]/n;
        }
        return answer;
    }
}