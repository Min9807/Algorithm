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
            // if(answer==29){
            //     answer += 11;
            // }
            // else if((answer+1)%3==0 || String.valueOf(answer+1).contains("3")){
            //     answer += 2;
            //     if(answer%3==0 || String.valueOf(answer).contains("3")){
            //         answer +=1;
            //     }
            // }
            // else{
            //     answer += 1;
            // }
        }
        return answer;
    }
}
