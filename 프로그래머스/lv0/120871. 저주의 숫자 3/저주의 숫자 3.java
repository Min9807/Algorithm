class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){

            while(true){
                answer+=1;
                if(!(answer%3==0 || String.valueOf(answer).contains("3"))){
                    break;
                }
            }
        }
        return answer;
    }
}
