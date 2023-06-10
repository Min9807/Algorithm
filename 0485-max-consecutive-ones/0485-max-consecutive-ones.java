class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int count = 0; // 카운팅
        for(int num : nums){
            if(num == 1){
                count++;
                answer = Math.max(answer, count);
            }else{
                count = 0;
            }
        }
        return answer;
    }
}