class Solution {
    public int solution(int n) {
        int answer = 0;
        int one = 0; // 첫번째 자리
        int two = 1; // 두번째 자리
        for(int i=1; i<n; i++){
            answer = one%1234567 + two%1234567;
            one = two;
            two = answer;
        }
        return answer%1234567;
    }
    
}