
class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int k = 0;
        int answer = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < max){
                max = prices[i];
            }
            k = prices[i] - max;
            if(k > answer){
                answer = k;
            }
        }

        return answer;
    }
}