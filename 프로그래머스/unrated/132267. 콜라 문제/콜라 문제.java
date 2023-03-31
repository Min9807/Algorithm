class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0; // 남는 콜라
        while(true){
            if(n < a){ // 남은 빈병이 교환해야되는 수보다 작은 경우
                break;
            }
            remain = n%a; // 바꾸지 못하는 남은 빈병들
            answer = answer + ((n/a) * b); // 받은 콜라
            n = ((n/a) * b) + remain; // 남은 빈병 + 받은 콜라
        }
        return answer;
    }
}