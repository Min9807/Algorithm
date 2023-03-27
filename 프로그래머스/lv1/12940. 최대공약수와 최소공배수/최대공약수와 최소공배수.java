class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        if(n>m){
            for(int i=1; i<n; i++){
                if(max<i && n%i==0 && m%i==0){
                    max=i;
                }
            }
        }else{
            for(int i=1; i<m; i++){
                if(max<i && n%i==0 && m%i==0){
                    max=i;
                }
            }
        }
        for(int i=m*n; i>=1; i--){
            if(i%m==0 && i%n==0){
                answer[1] =i;
            }
        }
        answer[0] = max;
        

        return answer;
    }
}