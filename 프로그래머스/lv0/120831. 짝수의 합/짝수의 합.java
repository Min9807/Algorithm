class Solution {
    public int solution(int n) {
        int sum = 0;
        while(n>1){
            if(n % 2==0){
                sum += n;
            }
            n--;
        }
        return sum;
    }
}