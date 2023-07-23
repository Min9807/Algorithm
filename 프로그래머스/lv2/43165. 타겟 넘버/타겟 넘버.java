class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int len, int sum){
        if(len == numbers.length){
            if(sum == target){
                answer++;
            }
        }else{
            dfs(numbers, target, len + 1, sum + numbers[len]);
            dfs(numbers, target, len + 1, sum - numbers[len]);
        }
    }
}