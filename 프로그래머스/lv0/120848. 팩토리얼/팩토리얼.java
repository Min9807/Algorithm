class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum=1;

        for(int i=1; i<=n; i++) {    
            sum=sum*i;
            if(sum==n){
                answer = i;
                break;
            }
            if(sum>n){
                answer = i-1;
                break;
            }

        }    
        return answer;
    }
}