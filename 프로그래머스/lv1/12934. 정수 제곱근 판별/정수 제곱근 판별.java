class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = (long)Math.sqrt(n);
        if(num*num!=n){
            return -1;
        }
        answer = (num+1) * (num+1);
        return answer;
    }
}