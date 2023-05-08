class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int weapon = divisor(i);
            if(limit<weapon){
                weapon = power;
            }
            answer += weapon;
        }
        
        return answer;
    }
    int divisor(int n){
        int sum = 0;
        for(int i=1; i*i<=n; i++){
            if(i * i == n) sum++;
            else if(n % i == 0) sum += 2;
        }
        return sum;
    }
}
