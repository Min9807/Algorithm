class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        int totalRound = n/2;
        
        for(int i=0; i<n/2; i++){
            if(a%2 != 0){
                a++;
            }
            if(b%2 != 0){
                b++;
            }
            
            a/=2;
            b/=2;
            
            if(a==b){
                break;
            }
            
            answer++;
        }

        return answer;
    }
}